/*
 * net.sf.wtk.xml.dom utilities for W3C XML DOM processing
 * Copyright (C) 2005  Bernhard Haumacher <haui@haumacher.de>
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package net.sf.wtk.xml.dom;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.xml.namespace.QName;

import net.sf.wtk.xml.dom.visitor.AbstractDOMVisitor;

import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMUtilities {
	
	public static final Iterable<Node> EMPTY_NODE_LIST = new EmptySequence<Node>(); 
	public static final Iterable<Element> EMPTY_ELEMENT_LIST = new EmptySequence<Element>();
	private static final Function<Element, Node> CAST_NODE_TO_ELEMENT = 
		new Function<Element, Node>() {
			public Element transform(Node node) {
				return (Element) node;
			}
		}; 
	
	public static final class EmptySequence<T> implements Iterable<T> {
		public Iterator<T> iterator() {
			return new EmptyIterator<T>();
		}
	};
	
	public static final class EmptyIterator<T> implements Iterator<T> {
		public boolean hasNext() {
			return false;
		}

		public T next() {
			throw new NoSuchElementException();
		}

		public void remove() {
			throw new NoSuchElementException();
		}
	};
 
	public static boolean isNamespaceDeclaration(String qname) {
		return qname.equals(DOMConstants.XMLNS_PREFIX) ||
				qname.startsWith(DOMConstants.NS_DEFINITION_ATTRIBUTE_PREFIX);
	}

	/**
	 * Transfers all child nodes from <code>source</code> to 
	 * <code>target</code>.  
	 */
	public static void transferContents(Node source, Node target) {
		while (source.hasChildNodes()) {
			Node child = source.getFirstChild();
			source.removeChild(child);
			target.appendChild(child);
		}
		
		// Transfer namespace related attributes.
		if (source.getNodeType() == Node.ELEMENT_NODE) {
			Element sourceElement = (Element) source;
			Element targetElement = (Element) target;
			
			NamedNodeMap attrs = sourceElement.getAttributes();
			for (int n = 0, cnt = attrs.getLength(); n < cnt; n++) {
				String qName = attrs.item(n).getNodeName();
				if (qName.equals(DOMConstants.XMLNS_PREFIX) ||
						qName.startsWith(DOMConstants.XMLNS_PREFIX + ':')) {
					targetElement.setAttribute(qName, attrs.item(n).getNodeValue());
				}
			}
		}
	}

	public static void clearContents(Node source) {
		while (source.hasChildNodes()) {
			Node child = source.getFirstChild();
			source.removeChild(child);
		}
	}

	public static void moveContents(Node source, Node target, Node before) {
		while (source.hasChildNodes()) {
			Node child = source.getFirstChild();
			source.removeChild(child);
			target.insertBefore(child, before);
		}
	}

	public static void importContents(Node source, Node target, Node before, boolean deep) {
		for (Node child = source.getFirstChild(); child != null; child = child.getNextSibling()) {
			target.insertBefore(target.getOwnerDocument().importNode(child, deep), before);
		}
	}

	public static void copyAttributesNS(Element source, Element target) {
		NamedNodeMap attributes = source.getAttributes();
		for (int n = 0, cnt = attributes.getLength(); n < cnt; n++) {
			Node attribute = attributes.item(n);
			target.setAttributeNS(
				attribute.getNamespaceURI(), 
				attribute.getLocalName(), 
				attribute.getTextContent());
		}
	}

	public static Iterable<Node> getChilds(final Node element) {
		return getChilds(element, Select.TRUE);
	}
	
	public static Node getFirstChild(final Select<? super Node> childSelector, final Node root) {
		Node child = root.getFirstChild();
		while ((child != null) && (! childSelector.isAccepted(child))) {
			child = child.getNextSibling();
		}
		return child;
	}

	public static Iterable<Node> getChilds(final Node element, final Select<? super Node> childSelector) {
		return new Iterable<Node>() {
			public Iterator<Node> iterator() {
				return new Iterator<Node>() {
					private Node child = findNext(element.getFirstChild());
					private Node current = null;
					
					private Node findNext(Node node) {
						while ((node != null) && (! childSelector.isAccepted(node))) {
							node = node.getNextSibling();
						}
						return node;
					}
					
					public boolean hasNext() {
						return child != null;
					}

					public Node next() {
						if (child == null) 
							throw new NoSuchElementException();

						current = child;
						child = findNext(child.getNextSibling());
						return current;
					}

					public void remove() {
						if (current == null)
							throw new IllegalStateException();
						
						current.getParentNode().removeChild(current);
						current = null;
					}
				};
			}
		};
	}

	public static Iterable<Node> getDescendantOrSelf(final Node node) {
		return getDescendantOrSelf(node, Select.TRUE);
	}

	public static Iterable<Node> getDescendantOrSelf(final Node node, final Select<? super Node> descendSelector) {
		return new Iterable<Node>() {
			public Iterator<Node> iterator() {
				return new Iterator<Node>() {
					Node last;
					Node top = node;
					Stack<Node> stack = new Stack<Node>();
					{
						if ((node != null) && 
								(node.getFirstChild() != null) &&
								descendSelector.isAccepted(node)) 
							stack.push(node.getFirstChild()); 
					}
					
					public boolean hasNext() {
						return top != null;
					}

					public Node next() {
						last = top;
						
						if (! stack.isEmpty()) {
							top = stack.pop();
							Node sibling = top.getNextSibling();
							if (sibling != null) {
								stack.push(sibling);
							}

							if (descendSelector.isAccepted(top)) {
								Node child = top.getFirstChild();
								if (child != null) {
									stack.push(child);
								}
							}
						} else {
							top = null;
						}

						return last;
					}

					public void remove() {
						last.getParentNode().removeChild(last);
						last = null;
					}
				};
			}
		};
	}
	
	public static Iterable<Attr> getAttributes(final Element element) {
		return new Iterable<Attr>() {
			public Iterator<Attr> iterator() {
				return new Iterator<Attr>() {
					final NamedNodeMap attributes = element.getAttributes();
					final int cnt = attributes.getLength();
					int n = 0;
					
					public boolean hasNext() {
						return n < cnt;
					}

					public Attr next() {
						return (Attr) attributes.item(n++);
					}

					public void remove() {
						// Attributes cannot be removed by this iterator,
						// because this would break the iteration of sibbling
						// elements.
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}

	public static Iterable<Node> getAncestorOrSelf(final Node node) {
		return new Iterable<Node>() {
			public Iterator<Node> iterator() {
				return new Iterator<Node>() {
					Node top = node;
					Node last = null;
					
					public boolean hasNext() {
						return top != null;
					}

					public Node next() {
						last = top;
						top = last.getParentNode();
						return last;
					}

					public void remove() {
						top.removeChild(last);
						last = null;
					}
				};
			}
		};
	}

	public static Iterable<Node> getPrecedingSibling(final Node node) {
		return new Iterable<Node>() {
			public Iterator<Node> iterator() {
				return new Iterator<Node>() {
					Node top = node.getPreviousSibling();
					Node last = null;
					
					public boolean hasNext() {
						return top != null;
					}

					public Node next() {
						last = top;
						top = last.getPreviousSibling();
						return last;
					}

					public void remove() {
						last.getParentNode().removeChild(last);
						last = null;
					}
				};
			}
		};
	}

	public static Iterable<Node> getFollowingSibling(final Node node) {
		return new Iterable<Node>() {
			public Iterator<Node> iterator() {
				return new Iterator<Node>() {
					Node top = node.getNextSibling();
					Node last = null;
					
					public boolean hasNext() {
						return top != null;
					}

					public Node next() {
						last = top;
						top = last.getNextSibling();
						return last;
					}

					public void remove() {
						last.getParentNode().removeChild(last);
						last = null;
					}
				};
			}
		};
	}
	
	public static Select<Node> getPositionFilter(final int startPos, final int stopPos) {
		return new Select<Node>() {
			int pos = 0;
			
			public boolean isAccepted(Node node) {
				boolean result = (pos >= startPos) && ((stopPos < 0) || (pos < stopPos));
				pos++;
				return result;
			}
		};
	}
	
	public static interface Select<T> {
		public static final Select<Object> TRUE = new Select<Object>() {
			public boolean isAccepted(Object obj) {
				return true;
			}
		};
		
		public boolean isAccepted(T obj);
	}

	public static interface Function<R, A> {
		public R transform(A arg);
	}
	
	public static <T> Iterable<T> filter(final Select<T> filter, final Iterable<T> sequence) {
		return new Iterable<T>() {
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					Iterator<T> source = sequence.iterator();
					T current;
					
					{ 
						findNext(); 
					}
					
					private void findNext() {
						current = null;
						while (source.hasNext()) {
							current = source.next();
							if (filter.isAccepted(current)) 
								break;
							else 
								current = null;
						}
					}
					
					public boolean hasNext() {
						return current != null;
					}

					public T next() {
						T result = current;
						findNext();
						return result;
					}

					public void remove() {
						source.remove();					
					}
				};
			}
		};
	}
	
	static <R,A> Iterable<R> map(final Function<R,A> transform, final Iterable<A> sequence) {
		return new Iterable<R>() {
			public Iterator<R> iterator() {
				return new Iterator<R>() {
					Iterator<A> source = sequence.iterator();
					
					public boolean hasNext() {
						return source.hasNext();
					}

					public R next() {
						return transform.transform(source.next());
					}

					public void remove() {
						source.remove();
					}
				};
			}
		};
	}

	public static Iterable<Element> toElements(Iterable<Node> nodes) {
		return map(CAST_NODE_TO_ELEMENT, nodes);
	}

	public static Iterable<Node> getIteratable(final NodeList nodes) {
		return new Iterable<Node>() {
			public Iterator<Node> iterator() {
				return new Iterator<Node>() {
					int length = nodes.getLength();
					int index= 0;
					
					public boolean hasNext() {
						return index < length;
					}
	
					public Node next() {
						return nodes.item(index++);
					}
	
					public void remove() {
						throw new UnsupportedOperationException();						
					}
				};
			}
		};
	}

	public static final Select<Node> IS_ELEMENT = new Select<Node>() {
		public boolean isAccepted(Node node) {
			return node.getNodeType() == Node.ELEMENT_NODE;
		}
	};

	public static final Select<Node> IS_TEXT = new Select<Node>() {
		public boolean isAccepted(Node node) {
			return node.getNodeType() == Node.TEXT_NODE;
		}
	};

	public static Select<Node> getElementSelect(final String localname) {
		return new Select<Node>() {
			public boolean isAccepted(Node node) {
				return (node.getNodeType() == Node.ELEMENT_NODE) &&
					localname.equals(node.getLocalName());
			}
		};
	}
	
	public static Select<Node> getAnyElementSelect(String ...localNames) {
		final HashSet<String> localNameSet = 
			new HashSet<String>(Arrays.asList(localNames));

		return new Select<Node>() {
			public boolean isAccepted(Node node) {
				return (node.getNodeType() == Node.ELEMENT_NODE) &&
					localNameSet.contains(node.getLocalName());
			}
		};
	}


	public static Select<Node> getElementSelectNS(final String namespaceURI, final String localName) {
		return new Select<Node>() {
			public boolean isAccepted(Node node) {
				return (node.getNodeType() == Node.ELEMENT_NODE) &&
					((namespaceURI == null) || namespaceURI.equals(node.getNamespaceURI())) &&
					((localName == null) || localName.equals(node.getLocalName()));
			}
		};
	}

	public static Select<Node> getAttributeSelect(final String localName) {
		return getAttributeSelect(localName, (String) null);
	}

	public static Select<Node> getAttributeSelect(final String localName, final String value) {
		return new Select<Node>() {
			public boolean isAccepted(Node node) {
				// System.out.println("AttributeTest(" + name + "): " + node.getLocalName());

				boolean isElement = (node.getNodeType() == Node.ELEMENT_NODE);
				if (! isElement) return false;

				Element element = (Element) node;

				return 
					element.hasAttribute(localName) && 
					((value == null) || value.equals(element.getAttribute(localName)));
			}
		};
	}

	public static Select<Node> getAttributeSelectNS(final String namespaceURI, final String localName) {
		return getAttributeSelectNS(namespaceURI, localName, (String) null);
	}

	public static Select<Node> getAttributeSelectNS(final String namespaceURI, final String localName, final String value) {
		return new Select<Node>() {
			public boolean isAccepted(Node node) {
				boolean isElement = node.getNodeType() == Node.ELEMENT_NODE;
				if (! isElement) return false;
				
				Element element = (Element) node;
				return 
					element.hasAttributeNS(namespaceURI, localName) && 
					((value == null) || value.equals(element.getAttributeNS(namespaceURI, localName)));
			}
		};
	}

	public static Select<Attr> getAttrSelect(final String localName) {
		return new Select<Attr>() {
			public boolean isAccepted(Attr node) {
				return localName.equals(node.getLocalName());
			}
		};
	}

	@SuppressWarnings("unchecked")
	public static Select<Node> getAttributeSelect(final String name, final Select<String> valueSelector) {
		return and(
			getAttributeSelect(name),
			new Select<Node>() {
				public boolean isAccepted(Node node) {
					return valueSelector.isAccepted(
						((Element) node).getAttribute(name));
				}
			});
	}

	@SuppressWarnings("unchecked")
	public static Select<Node> getAttributeSelectNS(final String namespaceURI, final String name, final Select<String> valueSelector) {
		return and(
			getAttributeSelectNS(namespaceURI, name),
			new Select<Node>() {
				public boolean isAccepted(Node node) {
					return valueSelector.isAccepted(
						((Element) node).getAttribute(name));
				}
			});
	}

	public static <T> Select<T> getEqualSelect(final T value) {
		return
			new Select<T>() {
				public boolean isAccepted(T obj) {
					return value.equals(obj);
				}
			};
	}

	public static Select<String> getContainsTokenSelect(final String value) {
		return
			new Select<String>() {
				public boolean isAccepted(String s) {
					// System.out.print("AttributeTokenTest(" + value + "): " + s);
					StringTokenizer tokens = new StringTokenizer(s, " \t\n\r", false);
					while (tokens.hasMoreTokens()) {
						if (value.equals(tokens.nextToken())) {
							return true;
						}
					}
					return false;
				}
			};
	}

	public static Select<Node> getNameSelectNS(QName qname) {
		return getNameSelectNS(qname.getNamespaceURI(), qname.getLocalPart());
	}

	public static Select<Node> getNameSelectNS(final String namespaceURI, final String localname) {
		return new Select<Node>() {
			public boolean isAccepted(Node node) {
				// System.out.println("NameNS(" + namespaceURI + ", " + localname + "): " + node.getLocalName());
				return (node.getNodeType() == Node.ELEMENT_NODE) &&
				namespaceURI.equals(node.getNamespaceURI()) &&
				localname.equals(node.getLocalName());
			}
		};
	}

	public static Select<Node> not(final Select<Node> select) {
		return new Select<Node>() {
			public boolean isAccepted(Node node) {
				return ! select.isAccepted(node);
			}
		};
	}

	public static Select<Node> and(final Select<Node> ...selects) {
		return new Select<Node>() {
			public boolean isAccepted(Node node) {
				for (Select<Node> select : selects) {
					if (! select.isAccepted(node)) return false;
				}
				return true;
			}
		};
	}
	
	public static Select<Node> or(final Select<Node> ... selects) {
		return new Select<Node>() {
			public boolean isAccepted(Node node) {
				for (Select<Node> select : selects) {
					if (select.isAccepted(node)) return true;
				}
				return false;
			}
		};
	}

	/**
	 * Visit all children nodes of the given element with the given visitor by
	 * passing the given additional argument to the visit method.
	 */
	public static <R, A> void descendChilds(AbstractDOMVisitor<R, A> visitor, Node element, A arg) {
		for (Node child = element.getFirstChild(); child != null; child = child.getNextSibling()) {
			visitor.startVisit(child, arg);
		}
	}

}
