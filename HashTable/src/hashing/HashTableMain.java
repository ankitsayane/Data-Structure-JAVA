package hashing;

import java.util.LinkedList;
import java.util.Scanner;

class HashTable {
	static class Pair {
		private int key; // key = roll
		private String value; // value = name;

		public Pair() {
			key = 0;
			value = "";
		}

		public Pair(int key, String value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return "Pair [key=" + key + ", value=" + value + "]";
		}
		
	}

	private static final int SLOT = 10;
	private LinkedList<Pair> table[];
	
	public int hash(int key) {
		return key % SLOT;
	}
	
	public HashTable() {
		table = new LinkedList[SLOT];
		for (int i = 0; i < SLOT; i++) {
			table[i] = new LinkedList<>();
		}
	}
	
	public void put(int key, String value) {
		int slot = hash(key);
		
		LinkedList<Pair> bucket  = table[slot];
		for(Pair p : bucket) {
			if(key == p.key) {
				p.value = value;
				return;
			}
		}
		Pair p = new Pair(key, value);
		bucket.add(p);
	}
	
	public String get(int key) {
		int slot = hash(key);
		
		LinkedList<Pair> bucket = table[slot];
		for(Pair p : bucket) {
			if(key == p.key) {
				return p.value;
			}
		}
		
		return null;
	}
	
}

public class HashTableMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashTable h = new HashTable();
		
		h.put(1, "Amit");
		h.put(2, "Mohit");
		h.put(3, "Amol");
		h.put(4, "Manoj");
		h.put(14, "Manisha");
		h.put(24, "Sumeet");
		h.put(9, "Zabhi");
		h.put(10, "Kushal");
		
		System.out.print("Enter Roll No. to find : ");
		int roll = sc.nextInt();
		String name = h.get(roll);
		System.out.println("Name found - "+name);
	}
}
