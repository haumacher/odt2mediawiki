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
package net.sf.wtk.common.dfa;

import java.util.HashMap;
import java.util.Map;

public class FiniteAutomata {

	private final Map<DFAState, Map<DFAEvent, DFAState>> transitions = 
		new HashMap<DFAState, Map<DFAEvent,DFAState>>();

	private DFAState initialState;

	public final class DFAState {
		private Object data;
		
		protected DFAState(Object data) {
			this.data = data;
		}
		
		public Object getData() {
			return data;
		}
		
		public void setData(Object data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return DFAState.class.getSimpleName() + '(' + data + ')';
		}
	}
	
	public final class DFAEvent {

		private Object data;

		protected DFAEvent(Object data) {
			this.data = data;
		}
		
		public Object getData() {
			return data;
		}
		
		public void setData(Object data) {
			this.data = data;
		}
		
		@Override
		public String toString() {
			return DFAEvent.class.getSimpleName() + '(' + data + ')';
		}

	}

	public DFAState newState(Object data) {
		DFAState result = new DFAState(data);
		
		// Remember the state by allocating an empty target state map.
		transitions.put(result, new HashMap<DFAEvent, DFAState>());
		
		return result;
	}

	public DFAEvent newEvent(Object data) {
		return new DFAEvent(data);
	}
	
	public void addTransition(DFAState source, DFAEvent event, DFAState target) {
		this.transitions.get(source).put(event, target);
	}

	public DFAState removeTransition(DFAState source, DFAEvent event) {
		return this.transitions.get(source).remove(event);
	}

	public DFAState getDestination(DFAState source, DFAEvent event) {
		return this.transitions.get(source).get(event);
	}

	public void setInitialState(DFAState initialState) {
		this.initialState = initialState;
	}
	
	public DFAState getInitialState() {
		return initialState;
	}

	public boolean canConsume(DFAState currentState, DFAEvent event) {
		DFAState destinationState = transitions.get(currentState).get(event);

		return destinationState != null;
	}
}
