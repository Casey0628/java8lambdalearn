package com.nkx.function;

@FunctionalInterface
public interface MyPredicate<T> {

	public boolean test(T t);
	
}
