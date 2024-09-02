package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		// insertion sort - swap of adjacent value from left till no swap is required
		int arr[] = {13,46, 24, 52, 20, 9};
		int size = arr.length;
		
		// best = O(n) and worst,avg - o(n^2)
		insertionSort(arr,size);
	}

	private static void insertionSort(int[] arr, int size) {
		for(int i=0;i<size;i++) {
			for(int j=i; j>0 && arr[j-1]>arr[j]; j--) {
				swap(arr,j,j-1);
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	private static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
}
