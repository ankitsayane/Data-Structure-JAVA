package com.operations;

import com.exception.ResourceNotFoundException;

public class DoublyLinkedList implements LinkedList {
	class Node {
		int data;
		Node prev;
		Node next;

		Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

	Node head;

	public DoublyLinkedList() {
		head = null;
	}

	@Override
	public void insertAtFront(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			return;
		}
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
	}

	@Override
	public void insertAtRear(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
			
		}
	}

	@Override
	public void deleteFromFront() {
		if (isEmpty()) {
			throw new ResourceNotFoundException("List is Empty");
		}

		head = head.next;

	}

	@Override
	public void deleteFromRear() {
		if(isEmpty()) {
			throw new ResourceNotFoundException("List is Empty");
		}
		if(head.next == null) {
			head = null;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.prev.next = null;
		temp.prev = null;

	}

	@Override
	public void show() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
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
