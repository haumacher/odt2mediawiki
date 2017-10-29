package net.sf.wtk.common.math;

public interface Equivalence<T> extends Relation<T, T> {

	public T getRepresentative(T x);

}
