package com.tester;

import com.operations.LinkedList;
import com.operations.SortedLinkedList;

public class Tester {
public static void main(String[] args) {
	LinkedList a = new SortedLinkedList();
	
	a.insert(20);;
	a.insert(10);
	a.insert(30);
	a.insert(15);
	a.insert(25);
	a.insert(40);
	a.insert(5);
	a.remove(40);
	a.show();
}
}
