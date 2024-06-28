package com.operations;

public interface SingleLinkedList<S> {
	void addAtFront(S data);
	void addAtRear(S data);
	void deleteFromFront();
	void deleteFromRear();
	void show();
	boolean isEmpty();
}
