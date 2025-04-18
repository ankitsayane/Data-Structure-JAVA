package com.operations;

import com.exception.StackUnderFlowException;

public class StackOperations<T> implements Stack<T> {

	int size = SIZE;
	T[] stack = (T[]) new Object[size];
	int top = -1;
	
	@Override
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(top==size-1) {
			return true;
		}
		return false;
	}

	@Override
	public void push(T ele) {
		if(isFull()) {
			T[] temp = (T[]) new Object[size*2];
			for(int i=0; i<size; i++) {
				temp[i] = stack[i];
			}
			stack = temp;
		}
		top++;
		stack[top] = ele;	
	}
	
	@Override
	public void pop() {
		if(isEmpty()) {
			throw new StackUnderFlowException("Stack is Empty");
		}
		stack[top] = null;
		top--;
	}
	
	@Override
	public void show() {
		for (T s : stack) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

	@Override
	public T peek() {
		if(isEmpty()) {
			throw new StackUnderFlowException("Stack is empty");
		}
		return stack[top];
	}

}
