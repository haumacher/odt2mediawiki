package net.sf.wtk.common.math;

public interface Group<T> {
	
	T identity();
	T combine(T x1, T x2);
	
}
