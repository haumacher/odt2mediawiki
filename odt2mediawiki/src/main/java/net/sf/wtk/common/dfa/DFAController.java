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

import java.util.Set;

import net.sf.wtk.common.collections.MultiHashMap;
import net.sf.wtk.common.dfa.FiniteAutomata.DFAEvent;
import net.sf.wtk.common.dfa.FiniteAutomata.DFAState;

public class DFAController {

	public static final String ENTER_COMMAND = "enter";
	private final FiniteAutomata algorithm;
	private DFAState currentState;
	
	private MultiHashMap<DFAState, StateObserver> listeners = new MultiHashMap<DFAState, StateObserver>();;
	
	public DFAController(FiniteAutomata algorithm) {
		if (algorithm.getInitialState() == null) {
			throw new IllegalStateException("Initial state of automata not initialized.");
		}
		
		this.algorithm = algorithm;
		this.currentState = algorithm.getInitialState();
	}
	
	public final DFAState getCurrentState() {
		return currentState;
	}
	
	public void addStateObserver(DFAState state, StateObserver listener) {
		listeners.add(state, listener);
	}
	
	public void removeStateObserver(DFAState state, StateObserver listener) {
		listeners.removeValue(state, listener);
	}
	
	public void reset() {
		this.currentState = algorithm.getInitialState();
		
		// Start processing.
		fireStateEvent(this.currentState, null, true);
	}


	private void fireStateEvent(DFAState state, DFAEvent event, boolean entered) {
		Set<StateObserver> listenerSet = listeners.get(state);
		if (listenerSet == null) return;
		
		StateObserver[] buffer = listenerSet.toArray(new StateObserver[listenerSet.size()]);
		for (StateObserver listener : buffer) {
			listener.stateChanged(state, event, entered);
		}
	}

	public void consume(DFAEvent event) {
		assertInitialized();
		
		DFAState sourceState = getCurrentState();
		if (! algorithm.canConsume(sourceState, event)) {
			throw new IllegalArgumentException("There is no target state for the given event.");
		}
		DFAState destinationState = algorithm.getDestination(sourceState, event);
		
		this.currentState = destinationState;

		fireStateEvent(sourceState, event, false);
		fireStateEvent(destinationState, event, true);
	}

	private void assertInitialized() {
		if (this.currentState == null) {
			throw new IllegalStateException("Automata not reset to its initial state.");
		}
	}

	public boolean canOccur(DFAEvent event) {
		return algorithm.canConsume(currentState, event);
	}

}
