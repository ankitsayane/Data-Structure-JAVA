package com.operations;

import com.exception.QueueOverFLowException;
import com.exception.QueueUnderFLowException;

public class QueueOperations<T> implements Queue<T> {
	
	int size = SIZE;
	T[] queue = (T[]) new Object[size];
	int front = 0;
	int rear = -1;

	@Override
	public void enQueue(T ele) {
		if(isFull()) {
			throw new QueueOverFLowException("Queue is full");
		}
		rear++;
		queue[rear] = ele;
		
	}

	@Override
	public void deQueue() {
		if(isEmpty()) {
			throw new QueueUnderFLowException("Queue is Empty");
		}
		queue[front] = null;
		front++;
		
	}

	@Override
	public void show() {
		for(T q : queue) {
			System.out.print(q+" ");
		}
		System.out.println();
		
	}

	@Override
	public boolean isEmpty() {
		if(rear < front) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(rear == size-1) {
			return true;
		}
		return false;
	}

}
