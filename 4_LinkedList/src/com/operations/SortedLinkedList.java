     package com.operations;

public class SortedLinkedList implements LinkedList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	Node head;
	public SortedLinkedList() {
		this.head = null;
	}

	@Override
	public void insert(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
			return;
		}
		
		if(head.data > data) {
			newNode.next = head;
			head = newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			if(temp.next.data > data) {
				break;
			}
			temp = temp.next;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;

	}

	@Override
	public void remove(int data) {
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		
		if(head.data == data) {
			head = head.next;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			if(temp.next.data == data) {
				break;
			}
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
	}

	@Override
	public void show() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp =temp.next;
		}
		System.out.println();
	}

	@Override
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}

}
