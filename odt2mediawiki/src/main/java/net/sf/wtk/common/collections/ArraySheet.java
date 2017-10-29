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

import java.util.Arrays;


public class ArraySheet<T> implements Sheet<T> {
	
	private T[] data = null;

	private int rows;
	private int columns;

	private int backedRows = 0;
	private int backedColumns = 0;

	public ArraySheet() {
		this(0, 0);
	}
	
	public ArraySheet(int rows, int columns) {
		setDimension(rows, columns);
	}

	public void set(int row, int column, T value) {
		checkAccess(row, column);
		ensureStorageSize(row, column);
		
		data[getIndex(row, column)] = value;
	}

	public T get(int row, int column) {
		checkAccess(row, column);
		
		if (isWithinStorage(row, column)) {
			return data[getIndex(row, column)];
		} else {
			return null;
		}
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}
	
	public void setRows(int rows) {
		setDimension(rows, columns);
	}
	
	public void setColumns(int columns) {
		setDimension(rows, columns);
	}
	
	public final void setDimension(int newRows, int newColumns) {
		
		if ((newColumns >= 0) && (newColumns < backedColumns)) {
			// Clear columns.
			for (int stopRow = Math.min(backedRows, newRows), row = 0; row < stopRow; row++) {
				Arrays.fill(data, 
					row * backedColumns + newColumns, 
					row * backedColumns + backedColumns, 
					null);
			}
		}
		
		if ((newRows >= 0) && (newRows < backedRows)) {
			// Clear rows.
			Arrays.fill(data, newRows * backedColumns, data.length, null);
		}
		
		this.rows = newRows;
		this.columns = newColumns;
	}

	private int getIndex(int row, int column) {
		return row * backedColumns + column;
	}

	private void checkAccess(int row, int column) {
		if (isWithinBounds(row, column)) {
			throw new IndexOutOfBoundsException(
				"Not within bounds: row=" + row + ", column=" + column + 
				", rows=" + dimensionToString(rows) + ", columns=" + dimensionToString(columns));
		}
	}

	public boolean isWithinBounds(int row, int column) {
		return (row < 0) || ((rows >= 0) && (row >= rows)) || (column < 0) || ((columns >= 0) && (column >= columns));
	}

	private String dimensionToString(int x) {
		return (x >= 0 ? Integer.toString(x) : "*");
	}

	private void ensureStorageSize(int row, int column) {
		if (isWithinStorage(row, column)) {
			return;
		}

		int newBackedRows = Math.max(backedRows, row + 1);
		int newBackedColumns = Math.max(backedColumns, column + 1);

		setStorageDimension(newBackedRows, newBackedColumns);
	}

	private void setStorageDimension(int newBackedRows, int newBackedColumns) {
		// Unsafe conversion due to problems with generics and arrays.
		T[] newData = (T[]) new Object[newBackedRows * newBackedColumns];
		
		if (backedRows > 0 && backedColumns > 0) {
			for (int copiedRow = 0; copiedRow < backedRows; copiedRow++) {
				System.arraycopy(data, copiedRow * backedColumns, newData, copiedRow * newBackedColumns, backedColumns);
			}
		}
		
		data = newData;
		backedRows = newBackedRows;
		backedColumns = newBackedColumns;
	}

	private boolean isWithinStorage(int row, int column) {
		return (row < backedRows && column < backedColumns);
	}

}
