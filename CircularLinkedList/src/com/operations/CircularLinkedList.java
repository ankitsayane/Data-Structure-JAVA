package com.operations;

public class CircularLinkedList implements LinkedList {
	class Node {
		int data;
		Node next;
	}

	Node head;

	public CircularLinkedList() {
		this.head = null;
	}

	@Override
	public void insertionAtFront(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
			return;
		}

		Node temp = head;
		while (temp.next != head) {
			temp = temp.next;
		}

		newNode.next = head;
		temp.next = newNode;
		head = newNode;

	}

	@Override
	public void insertionAtEnd(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
			return;
		}

		Node temp = head;
		while (temp.next != head) {
			temp = temp.next;
		}

		temp.next = newNode;
		newNode.next = head;

	}

	@Override
	public void deleteFromFront() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		}

		Node temp = head;
		while (temp.next != head) {
			temp = temp.next;
		}

		head = head.next;
		temp.next = head;

	}

	@Override
	public void deleteFromEnd() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		}

		Node temp = head;
		while (temp.next.next != head) {
			temp = temp.next;
		}

		temp.next = head;

	}
	
	@Override
	public void sort() {
		if(head == null || head.next == head) {
			return;
		}
		
		boolean swapped;
		Node curr;
		Node last = null;
		
		do {
			swapped = false;
			curr = head;
			
			while(curr.next != last && curr.next != head) {
				if(curr.data > curr.next.data) {
					int temp = curr.data;
					curr.data = curr.next.data;
					curr.next.data = temp;
					swapped = true;
				}
				curr = curr.next;
			}
			last  = curr;
		}while(swapped);
		
	}

	@Override
	public void remove(int data) {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}

		if (head.data == data) {
			deleteFromFront();
			return;
		}

		Node temp = head;
		while (temp.next != head) {
			if (temp.next.data == data) {
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;
		}
		System.out.println("Data not found in the list");
	}

	@Override
	public void display() {
		Node temp = head;
		while (temp.next != head) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data + " ");
		System.out.println();
	}

	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

}
