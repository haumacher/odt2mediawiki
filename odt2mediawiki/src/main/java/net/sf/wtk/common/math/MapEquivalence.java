package net.sf.wtk.common.math;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEquivalence<T> implements Equivalence<T> {

	Map<T, T> representativeFor = new HashMap<T, T>();

	public MapEquivalence() {
	}
	
	public MapEquivalence(Relation<T, T> symmetricRelation, List<T> objects) {
		for (int n = 0, cnt = objects.size(); n < cnt; n++) {
			T a = objects.get(n);
			if (representativeFor.containsKey(a)) continue;
			
			for (int i = n + 1; i < cnt; i++) {
				T b = objects.get(i);
				if (symmetricRelation.isRelated(a, b)) {
					representativeFor.put(b, a);
				}
			}
		}
	}
	
	public boolean isRelated(T a, T b) {
		return getRepresentative(a) == getRepresentative(b);
	}
	
	public void addEquivalence(T a, T b) {
		T ra = getRepresentative(a);
		T rb = getRepresentative(b);
		if (ra != rb) {
			representativeFor.put(ra, rb);
		}
	}

	public T getRepresentative(T x) {
		T rx = representativeFor.get(x);
		if (rx == null) {
			// x is the representative of its partition. 
			return x;
		}
		
		// Recursively compute the representative for x.
		T rrx = getRepresentative(rx);
		if (rrx != rx) {
			// The representative for x is not reachable with a single
			// lookup in the representative map. Update the map to establish
			// a direct reference from x to the representative of its
			// partition.
			representativeFor.put(x, rrx);
		}
		return rrx;
	}

}
