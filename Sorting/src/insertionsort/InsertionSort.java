package insertionsort;

public class InsertionSort {
	public static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && key<arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = key;
		}
	}

	public static void main(String[] args) {
		int [] arr = {10, 5, 8, 2, 1, 4, 7, 3};
		insertionSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
