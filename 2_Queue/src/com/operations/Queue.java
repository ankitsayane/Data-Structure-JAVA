package com.operations;

public interface Queue<T> {
	int SIZE = 6;
	void enQueue(T ele);
	void deQueue();
	void show();
	boolean isEmpty();
	boolean isFull();
}
