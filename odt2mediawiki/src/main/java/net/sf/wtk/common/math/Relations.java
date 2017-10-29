package net.sf.wtk.common.math;

public class Relations {
	
	private static final Relation<?, ?> EQUALITY = new Relation<Object, Object>() {
		public boolean isRelated(Object a, Object b) {
			if (a == b) return true;
			if (a == null || b == null) return false;
			return a.equals(b);
		}
	};

	public static final Relation<Integer, Integer> INTEGER_LOWER_OR_EQUAL = new Relation<Integer, Integer>() {

		public boolean isRelated(Integer a, Integer b) {
			if (a == b) return true;
			
			// \all x: null <= x
			if (a == null) return true;
			
			// \all x != null: x > null
			if (b == null) return false;
			
			return a <= b;
		}
		
	};

	/**
	 * The equality relation for objects including <code>null</code>, based
	 * on the built-in {@link Object#equals(Object)} method and the
	 * <code>==</code> operator.
	 */
	@SuppressWarnings("unchecked")
	public static <T> Relation<T, T> equality() {
		return (Relation<T, T>) EQUALITY;
	}

	/**
	 * Constructs an equality relation based on the given total order (greater
	 * or equal relation).
	 */
	public static <T> Relation<T, T> equality(final Relation<T, T> totalOrder) {
		return new Relation<T, T>() {
			public boolean isRelated(T a, T b) {
				return totalOrder.isRelated(a, b) && totalOrder.isRelated(b, a);
			}
		};
	}
	
	/**
	 * Returns the inverted order relation.
	 */
	public static <T> Relation<T, T> invert(final Relation<T, T> order) {
		return new Relation<T, T>() {
			public boolean isRelated(T a, T b) {
				return order.isRelated(b, a);
			}
		};
	}
	
}
