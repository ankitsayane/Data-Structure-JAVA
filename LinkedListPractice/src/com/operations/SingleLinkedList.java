package com.operations;

import com.exception.ResourceNotFoundException;

public class SingleLinkedList implements LinkedList {
	class Node{
		int data;
		Node next;
	}
	
	Node head;
	Node tail;
	public SingleLinkedList() {
		head = null;
		tail = null;
	}

	@Override
	public void insertAtFront(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
		if(tail == null) {
			tail = newNode;
		}
	}

	@Override
	public void insertAtRear(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
		}
		tail.next = newNode;
	}

	@Override
	public void insertAtIndex(int pos, int data) {
		if(isEmpty()) {
			insertAtFront(data);
			return;
		}
		if(pos == sizeOfLL()) {
			insertAtRear(data);
			return;
		}
		Node newNode = new Node();
		newNode.data = data;
		Node temp = head;
		for(int i=0; i<pos-1; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
	}

	@Override
	public void removeFromFront() {
		if(isEmpty()) {
			throw new ResourceNotFoundException("LinkedList is Empty");
		}
		
		head = head.next;
		
		if(isEmpty()) {
			tail = null;
		}
	}

	@Override
	public void removeFromRear() {
		if(isEmpty()) {
			throw new ResourceNotFoundException("LinkedList is Empty");
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		tail = temp;
		temp.next = null;
		
		if(isEmpty()) {
			tail = null;
		}
		
	}

	@Override
	public void removeFromIndex(int pos) {
		if(isEmpty()) {
			throw new ResourceNotFoundException("LinkedList is Empty");
		}
		if(sizeOfLL() < pos) {
			throw new ResourceNotFoundException("Position is out of bound");
		}
		if(pos == 1) {
			removeFromFront();
		}
		Node temp = head;
		for(int i=0; i<pos-1; i++) {
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
	}

	@Override
	public boolean isPresent(int data) {
		Node temp = head;
		int pos = 0;
		while(temp != null) {
			pos++;
			if(temp.data == data) {
				System.out.println("Present at - "+pos);
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	@Override
	public int sizeOfLL() {
		Node temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}

	@Override
	public void reverseList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

}
