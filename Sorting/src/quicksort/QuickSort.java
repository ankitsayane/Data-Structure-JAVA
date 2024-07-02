package quicksort;

public class QuickSort {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void quickSort(int[] arr, int left, int right) {
		if(left>=right) {
			return;
		}
		
		int i=0, j=right;
		while(i<j) {
			while(i <= right && arr[i]<=arr[left]) {
				i++;
			}
			while(arr[j]>arr[left]) {
				j--;
			}
			if(i<j) {
				swap(arr, i, j);
			}
		}
		swap(arr, j, left);
		quickSort(arr, left, j-1);
		quickSort(arr, j+1, right);
	}

	public static void main(String[] args) {
		int[] arr = { 9, 6, 8, 1, 3, 7, 5 };
		quickSort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
