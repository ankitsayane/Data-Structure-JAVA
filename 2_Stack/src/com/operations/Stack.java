package com.operations;

public interface Stack<T> {
	int SIZE = 5;
	boolean isEmpty();
	boolean isFull();
	void show();
	void push(T ele);
	void pop();
	T peek();
}
