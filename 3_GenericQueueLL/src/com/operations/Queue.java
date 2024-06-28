package com.operations;

public interface Queue<A> {
	void enQueue(A data);
	void deQueue();
	void show();
	boolean isEmpty();
}
