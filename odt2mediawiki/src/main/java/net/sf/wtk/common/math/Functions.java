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
package net.sf.wtk.common.math;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Functions {

	private static class Identity<T> implements Function<T, T> {
		public T apply(T arg) {
			return arg;
		}
	}
	
	public static <T> Function<T, T> getIdentity() {
		// With Java generics, this cannot be safely expressed with a singleton
		// instance. (Is this really the case?)
		return new Identity<T>();
	}

	public static <R, A> Set<R> map(Function<R, A> fun, Set<A> args) {
		HashSet<R> result = new HashSet<R>(args.size());
		for (A arg : args) {
			result.add(fun.apply(arg));
		}
		return result;
	}
	
	public static <R, A> List<R> map(Function<R, A> fun, List<A> args) {
		ArrayList<R> result = new ArrayList<R>(args.size());
		for (A arg : args) {
			result.add(fun.apply(arg));
		}
		return result;
	}
	
	public static <A> Set<A> filter(Function<Boolean, A> fun, Set<A> args) {
		HashSet<A> result = new HashSet<A>();
		for (A arg : args) {
			if (fun.apply(arg)) {
				result.add(arg);
			}
		}
		return result;
	}
	
	public static <A> List<A> filter(Function<Boolean, A> fun, List<A> args) {
		ArrayList<A> result = new ArrayList<A>();
		for (A arg : args) {
			if (fun.apply(arg)) {
				result.add(arg);
			}
		}
		return result;
	}
}
