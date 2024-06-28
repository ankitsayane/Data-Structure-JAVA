package com.operations;

public interface LinkedList {
	void insertAtFront(int data);
	void insertAtRear(int data);
	void insertAtIndex(int pos, int data);
	void removeFromFront();
	void removeFromRear();
	void removeFromIndex(int pos);
	boolean isPresent(int data);
	int sizeOfLL();
	boolean isEmpty();
	void reverseList();
	void show();
}
