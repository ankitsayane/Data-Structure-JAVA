package selectionsort;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++ ) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		int [] arr = {10, 5, 8, 2, 1, 4, 7, 3};
		selectionSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
