/*
 * Web Widget Toolkit (WTK): Server-side components for web-based user interfaces
 * Copyright (C) 2006 Bernhard Haumacher <haui@haumacher.de>
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place, Suite 330, Boston, MA 02111-1307 USA
 */
package net.sf.wtk.common.collections;

public class Tuple<T> {
	
	private final int hashcode;
	private final T[] elements;

	public Tuple(T... elements) {
		this.elements = elements;
		this.hashcode = initHashCode();
	}
	
	private int initHashCode() {
		int result = elements.length;
		for (T element : elements) {
			if (element == null) continue;
			result += element.hashCode();
		}
		return result;
	}

	public T get(int index) {
		return elements[index];
	}
	
	@Override
	public int hashCode() {
		return hashcode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (! (obj instanceof Tuple)) return false;

		Tuple<?> other = (Tuple<?>) obj;
		if (this.hashcode != other.hashcode) return false;
		if (this.elements.length != other.elements.length) return false;
		
		for (int cnt = elements.length, n = 0; n < cnt; n++) {
			if (! elements[n].equals(other.elements[n])) return false;
		}

		return true;
	}
	
}
