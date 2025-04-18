package com.operations;

import com.exceptions.ResourceNotFoundException;

public class LinkedListQueue<A> implements Queue<A> {
	class Node {
		A data;
		Node next;
	}

	Node head;

	public LinkedListQueue() {
		head = null;
	}

	@Override
	public void enQueue(A data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (isEmpty()) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	@Override
	public void deQueue() {
		if (isEmpty()) {
			throw new ResourceNotFoundException("Queue is Empty");
		}

		head = head.next;
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
