package queue;

import java.util.StringJoiner;

public class CircularQueue {
	private String[] queue;
	private int front;
	private int rear;
	private int size;
	private int capacity;
	
	public CircularQueue(int capacity) {
		this.capacity  = capacity;
		queue = new String[capacity];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	public boolean add(String ele) {
		if(isFull()) {
			System.out.println("Queue is Full");
			return false;
		}
		
		rear = (rear + 1)%capacity;
		queue[rear] = ele;
		size++;
		if(front == -1) {
			front = rear;
		}
		return true;
	}
	
	public String remove() {
		if(isEmpty()) {
			return null;
		}
		String del = queue[front];
		front = (front+1)%capacity;
		size--;
		if(isEmpty()) {
			front = -1;
			rear = -1;
		}
		return del;
	}
	
	public String toString() {
        if (isEmpty()) {
            return "";
        }
        StringJoiner joiner = new StringJoiner(", ");
        int current = front;
        for (int i = 0; i < size; i++) {
            joiner.add(queue[current]);
            current = (current + 1) % capacity;
        }
        return joiner.toString();
    }
	
	public int size() {
		return size;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}
