package com.operations;

import com.exception.ResourceNotFoundException;

public class LinkedList<S> implements SingleLinkedList<S>{
	//Linked List
	class Node{
		S data;
		Node next;
	}
	
	Node head;
	Node tail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	

	@Override
	public void addAtFront(S data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
		
		if(tail==null) {
			tail = newNode;
		}
		
	}

	@Override
	public void addAtRear(S data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
		}
		
		tail.next = newNode;
		tail = newNode;
	}

	@Override
	public void deleteFromFront() {
		if(isEmpty()) {
			throw new ResourceNotFoundException("Linked List is Empty");
		}
		//assign head to the next node
		head = head.next;
		
		// check whether list is empty after deletion then assign tail == null 
		// because previously tail is pointing to the only node in list
		if(isEmpty()) {
			tail = null;
		}
	}

	@Override
	public void deleteFromRear() {
		if(isEmpty()) {
			throw new ResourceNotFoundException("Linked List is Empty");
		}
		
		//to get the second last node in list
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		
		tail = temp;
		temp.next = null;
		
		//if only one element in list and after deletion now list is empty then assign tail to null
		if(isEmpty()) {
			tail = null;
		}
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

	@Override
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}

}
