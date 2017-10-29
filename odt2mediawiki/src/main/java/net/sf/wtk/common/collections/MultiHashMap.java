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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MultiHashMap<K, V> implements Iterable<K> {

	private Map<K, Set<V>> data = new HashMap<K, Set<V>>();

	public void add(K key, V value) {
		Set<V> valuesForKey = data.get(key);
		if (valuesForKey == null) {
			valuesForKey = new HashSet<V>();
			data.put(key, valuesForKey);
		}
		valuesForKey.add(value);
	}

	public Set<V> get(K key) {
		return data.get(key);
	}

	public void removeKey(K key) {
		data.remove(key);
	}

	public boolean removeValue(K key, V value) {
		Set<V> valuesForKey = data.get(key);
		if (valuesForKey == null) {
			return false;
		}
		
		return valuesForKey.remove(value);
	}

	public Iterator<K> iterator() {
		return data.keySet().iterator();
	}

	public Set<Entry<K, Set<V>>> getEntrySet() {
		return data.entrySet();
	}

}
