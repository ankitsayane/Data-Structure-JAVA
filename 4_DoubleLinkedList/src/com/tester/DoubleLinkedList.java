package com.tester;


import com.operations.SortedDoublyLL;

public class DoubleLinkedList {

	public static void main(String[] args) {
		SortedDoublyLL a = new SortedDoublyLL();
		a.push(23);
		a.push(2);
		a.push(25);
		a.push(1);
		a.push(10);
		a.push(50);
		a.show();
		a.pop(2);
		a.pop(50);
		a.show();
	}

}
