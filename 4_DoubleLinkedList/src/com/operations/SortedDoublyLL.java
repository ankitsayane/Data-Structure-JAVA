package com.operations;

import com.exception.ResourceNotFoundException;

public class SortedDoublyLL implements DoubleLinkedList {
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	Node head;
	public SortedDoublyLL() {
		this.head = null;
	}

	@Override
	public void push(int data) {
		Node newNode  = new Node(data);
		
		if(isEmpty()) {
			head = newNode;
			return;
		}
		
		Node curr = head;
		
		while(curr != null) {
			if(curr.data > newNode.data) {
				break;
			}
			curr = curr.next;
		}

		
		//insert node at front
		if(curr == head) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			return;
		}
		
		//insert node at end
		if(curr == null) {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = newNode;
			newNode.prev = temp;
			return;
		}
		
		//insert node in middle
		newNode.prev = curr.prev;
		newNode.next = curr;
		curr.prev.next = newNode;
		curr.prev = newNode;

	}

	@Override
	public void pop(int data) {
	    if (isEmpty()) {
	        throw new ResourceNotFoundException("List is Empty");
	    }

	    Node temp = head;
	    
	    while(temp != null) {
	    	if(temp.data == data) {
	    		break;
	    	}
	    	temp = temp.next;
	    }
	    
	    if(temp == head) {
	    	head = head.next;
	    	if(head == null) {
	    		head.prev = null;
	    	}
	    	head.prev = null;
	    }
	    
	    temp.prev.next = temp.next;
	    temp.next.prev = temp.prev;
	    
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
		if(head == null) {
			return true;
		}
		return false;
	}

}
