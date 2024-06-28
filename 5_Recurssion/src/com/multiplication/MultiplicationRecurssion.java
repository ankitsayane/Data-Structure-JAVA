package com.multiplication;

public class MultiplicationRecurssion {
	
	public static int multiplication(int x, int y) {
		if(x==0 || y==0) {
			return 0;
		}
		if(x==1) {
			return y;
		}
		if(y==1) {
			return x;
		}
		if(y>0) {
			System.err.println("x = "+x+", y = "+y);
			return x + multiplication(x, y-1);
		}
		if(y<0) {
			return -multiplication(x, -y);
		}
		
		
		return -1;
	}

	public static void main(String[] args) {
		int x = multiplication(10, 5);
		System.out.println(x);

	}

}
