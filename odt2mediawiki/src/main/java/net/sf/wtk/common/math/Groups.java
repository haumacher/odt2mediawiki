package net.sf.wtk.common.math;

import static java.lang.Boolean.FALSE;

public class Groups {

	public static final Group<Boolean> BOOLEAN_OR_GROUP = new Group<Boolean>() {
	
		public Boolean identity() {
			return FALSE;
		}
	
		public Boolean combine(Boolean x1, Boolean x2) {
			return x1.booleanValue() || x2.booleanValue();
		}
	
	};
	
	public static final Group<Integer> INTEGER_MINIMUM = new Group<Integer>() {

		public Integer combine(Integer x1, Integer x2) {
			if (x1 == null) return x2;
			if (x2 == null) return x1;
			if (x1 <= x2) return x1;
			return x2;
		}

		public Integer identity() {
			return null;
		}
		
	};

	private static final Group<?> ONLY_ELEMENT = new Group<Object>() {

		public Object identity() {
			return null;
		}
		
		public Object combine(Object x1, Object x2) {
			if (x1 == null) {
				return x2;
			} else {
				if (x2 != null) {
					throw new IllegalArgumentException("More than one non-null argument.");
				}
				
				return x1;
			}
		}
	};
	
	
	@SuppressWarnings("unchecked")
	public static <T> Group<T> onlyElement() {
		return (Group<T>) ONLY_ELEMENT;
	}

}
