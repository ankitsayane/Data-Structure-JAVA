package mergesort;

public class MergeSort {
	public static void mergeSort(int[] arr, int left, int right) {
		if(left >= right) {
			return;
		}
		
		int mid = (left + right) / 2;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);

		int[] temp = new int[right - left + 1];
		int i = left, j = mid + 1, k = 0;
		while (i <= mid && j <= right) {
			if (arr[i] > arr[j]) {
				temp[k++] = arr[j++];
			} else {
				temp[k++] = arr[i++];
			}
		}
		while(i <= mid) {
			temp[k++] = arr[i++];
		}
		while(j <= right) {
			temp[k++] = arr[j++];
		}
		for(i=0; i<temp.length; i++) {
			arr[left + i] = temp[i];
		}
	}

	public static void main(String[] args) {
		int[] arr = { 12, 3, 8, 11, 4, 2, 1 };
		mergeSort(arr, 0, arr.length-1);
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();

	}

}
