package com.doublyCircularLL;

public interface DoublyLinkedList {
	void addAtFront(int data);
	void addAtRear(int data);
	void addAtPosition(int data, int pos);
	void deleteFromFront();
	void deleteFromRear();
	void deleteFromPosition(int pos);
	void display();
	boolean isEmpty();
}
