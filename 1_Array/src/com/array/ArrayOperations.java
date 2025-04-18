package com.array;

public class ArrayOperations {
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] insertion(int[] arr, int pos, int ele) {
		int n = arr.length;
		int[] newArr = new int[n+1];
		for(int i=0; i<n; i++) {
			newArr[i]=arr[i];
		}
		for(int j=n; j>=pos; j--) {
			newArr[j]=arr[j-1];
		}
		newArr[pos]=ele;
		return newArr;
	}

	public static int[] deletionByIndex(int[] arr, int pos) {
		int[] newArr = new int[arr.length-1];
		int k=0;
		for(int i=0; i<arr.length; i++) {
			if(i==pos) {
				continue;
			}
			newArr[k++] = arr[i];
		}
		return newArr;
	}

	public static int[] deleteElement(int[] arr, int ele) {
		int[] newArr = new int[arr.length-1];
		int k=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==ele) {
				continue;
			}
			newArr[k++] = arr[i];
		}
		return newArr;
	}

	public static void evenOdd(int[] arr) {
		System.out.println("Even numbers");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println("\nOdd numbers");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		
	}

	public static int sumation(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void minMax(int[] arr) {
		int min = arr[0], max=arr[0], smax=Integer.MIN_VALUE;
		if(arr.length<=2) {
			System.out.println("Array length insufficient");
		}
		for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;  
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
		System.out.println("Maximum - "+max);
		System.out.println("Minimum - "+min);
		System.out.println("Second Max - "+smax);
		
	}

}
