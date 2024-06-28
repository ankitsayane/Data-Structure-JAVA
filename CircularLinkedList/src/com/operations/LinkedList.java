package com.operations;

public interface LinkedList {
	void insertionAtFront(int data);
	void insertionAtEnd(int data);
	void deleteFromFront();
	void deleteFromEnd();
	void remove(int data);
	void sort();
	void display();
	boolean isEmpty();
}
