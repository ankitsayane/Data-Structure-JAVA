package com.doublyCircularLL;

public class CircularDoublyLL implements DoublyLinkedList {
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
	public CircularDoublyLL() {
		head = null;
	}

	@Override
	public void addAtFront(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			head = newNode;
			newNode.next = head;
			newNode.prev = head;
			return;
		}
		
		Node temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		
		head.prev = newNode;
		temp.next = newNode;
		newNode.next = head;
		newNode.prev = temp;
		head = newNode;
		
		

	}

	@Override
	public void addAtRear(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			head = newNode;
			newNode.next = head;
			newNode.prev = head;
			return;
		}
		
		Node temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		
		temp.next = newNode;
		newNode.prev = temp;
		newNode.next = head;
		head.prev = newNode;

	}

	@Override
	public void addAtPosition(int data, int pos) {
		Node newNode = new Node(data);
		if(isEmpty() && pos==1) {
			head = newNode;
			newNode.next = head;
			head.prev = newNode;
			return;
		}
		if(pos==1) {
			addAtFront(data);
//			newNode.prev = head.prev;
//			head.prev.next = newNode;
//			newNode.next = head;
//			head.prev = newNode;
//			head = newNode;
			return;
		}
		
		Node temp = head;
		int count = 1;
		
		while(temp.next != head && count<pos-1) {
			temp = temp.next;
			count++;
		}
		
		if (count < pos - 1) {
	        System.out.println("Position out of bounds");
	        return;
	    }
		
		newNode.next = temp.next;
		newNode.prev = temp;
		temp.next.prev = newNode;
		temp.next = newNode;

		if (temp.next == head && count == pos - 1) {
	        newNode.next = head;
	        head.prev = newNode;
	    }
	}

	@Override
	public void deleteFromFront() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		Node temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		
		head = head.next;
		head.prev = temp;
		temp.next = head;

	}

	@Override
	public void deleteFromRear() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		
		if(head.next == head) {
			head = null;
			return;
		}
		
		Node temp = head;
		
		if(temp.next.next == head) {
			temp.next = head;
			head.prev = temp;
		}
		temp = head;
		while(temp.next.next != head) {
			temp = temp.next;
		}
		
		temp.next = head;
		head.prev = temp;

	}

	@Override
	public void deleteFromPosition(int pos) {
		if(isEmpty()) {
			System.out.println("LinkedList is Empty");
			return;
		}
		
		
		if(pos == 1) {
			deleteFromFront();
			return;
		}
		
		int count = 1;
		Node temp = head;
		while(temp.next.next != head && count < pos-1) {
			count++;
			temp = temp.next;
		}
		
		if (temp.next == head || temp.next.next == head && count < pos - 1) {
	        System.out.println("Position out of bounds");
	        return;
	    }
		Node del = temp.next;
		temp.next = del.next;
		del.next.prev = temp;
		
		if (del.next == head) {
	        temp.next = head;
	        head.prev = temp;
	    }
	}

	@Override
	public void display() {
		Node temp = head;
		while(temp.next != head) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data);
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
