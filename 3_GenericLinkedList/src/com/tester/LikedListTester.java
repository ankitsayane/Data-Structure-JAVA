package com.tester;

import com.operations.LinkedList;
import com.operations.SingleLinkedList;

public class LikedListTester {
	public static void main(String[] args) {
		SingleLinkedList list = new LinkedList();
		
		list.addAtFront("a");
		list.addAtFront(2.49);
		list.show();
		list.addAtRear(23);
		list.show();
		list.deleteFromFront();
		list.show();
		list.deleteFromRear();
		list.show();
	}
}
