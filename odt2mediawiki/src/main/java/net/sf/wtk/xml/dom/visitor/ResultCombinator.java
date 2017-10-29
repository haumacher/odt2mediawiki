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
package net.sf.wtk.xml.dom.visitor;

public interface ResultCombinator<R> {
	public static final ResultCombinator<Void> VOID_COMBINATOR = new ResultCombinator<Void>() {
		public Void combine(Void r1, Void r2) {
			return null;
		}

		public Void zero() {
			return null;
		}
	};

	public static final ResultCombinator<Boolean> BOOLEAN_OR_COMBINATOR = new ResultCombinator<Boolean>() {
		public Boolean combine(Boolean r1, Boolean r2) {
			return r1 || r2;
		}

		public Boolean zero() {
			return false;
		}
	};

	public static final ResultCombinator<Integer> INTEGER_SUM_COMBINATOR = new ResultCombinator<Integer>() {
		public Integer combine(Integer r1, Integer r2) {
			return r1 + r2;
		}

		public Integer zero() {
			return 0;
		}
	};

	public static final ResultCombinator<String> STRING_CONCAT_COMBINATOR = new ResultCombinator<String>() {
		public String combine(String r1, String r2) {
			return r1 + r2; 
		}

		public String zero() {
			return "";
		}
	};

	public R zero();
	public R combine(R r1, R r2);
}
