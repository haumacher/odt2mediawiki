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


public interface Sheet<T> {

	public void set(int row, int column, T value);

	public T get(int row, int column);

	/**
	 * Upper limit of rows in this {@link ArraySheet}, or <code>-1</code>, if
	 * there is no limit.
	 */
	public int getRows();

	/**
	 * Upper limit of columns in this {@link ArraySheet}, or <code>-1</code>, if
	 * there is no limit.
	 */
	public int getColumns();

	public void setRows(int rows);

	public void setColumns(int columns);

	public void setDimension(int newRows, int newColumns);

	public boolean isWithinBounds(int row, int column);

}
