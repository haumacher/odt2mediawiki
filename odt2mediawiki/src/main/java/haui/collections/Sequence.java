/*
 * haui.collections utilities for collection processing
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
package haui.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * An on the fly appendable sequence of objects of type <code>T</code>.
 * 
 * The {@link #iterator()} of this sequence iterates over all objects of all
 * sequences passed to the constructor and those added to this sequence with
 * any of its {@link #add(Iterable) add} methods.
 * 
 * This class may only be used in a single-threaded context.
 * 
 * TODO: Move this class to some more adequate package.
 */
public class Sequence<T> implements Iterable<T> {
	private boolean once;
	private final LinkedList<Iterator<T>> queue = new LinkedList<Iterator<T>>();
	
	public Sequence() {
	}

	public Sequence(Iterable<T> seq) {
		add(seq);
	}

	public Sequence(Iterator<T> seq) {
		add(seq);
	}

	public Sequence(T obj) {
		addSingleton(obj);
	}
	
	public final void add(Iterable<T> seq) {
		add(seq.iterator());
	}

	public final void add(Iterator<T> seq) {
		queue.addLast(seq);
	}

	public final void addSingleton(T obj) {
		queue.addLast(Collections.singletonList(obj).iterator());
	}
	
	public Iterator<T> iterator() {
		if (once) {
			throw new IllegalStateException("This sequence is already iterated.");
		}
		
		return new Iterator<T>() {
			public boolean hasNext() {
				while (true) {
					if (queue.isEmpty()) {
						return false;
					}
					if (queue.getFirst().hasNext()) {
						return true;
					}
					queue.remove();
				}
			}

			public T next() {
				return queue.getFirst().next();
			}

			public void remove() {
				throw new UnsupportedOperationException("Elements cannot be removed from a sequence.");
			}
		};
	}
	
}