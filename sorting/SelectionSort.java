package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		// selection sort - every iteration find min value and swap it.
		
		int arr[] = {13,46, 24, 52, 20, 9};
		int size = arr.length;
		
//		1=> [ 13 46 24 52 20 9 ] - min = 9, swap(9,13)
//		2=> 9  [ 46 24 52 20 13 ] - min = 13, swap(13,36)
//		3=> 9 13 [ 24 52 20 46 ] - min = 20, swap(20,24)
//		4=> 9 13 20 [ 52 24 46] - min = 24, swap(24,52)
//		5=> 9 13 20 24 [52 46 ] - min = 46, swap(46,52)
//		 => 9 13 20 24 46 [52] 
//		final Ans => 9 13 20 24 46 52			
		
		// n+n-1+n-2....1 = n*(n+1)/2 = O(n^2) = best,avg,worst
		selectionSort(arr,size);
	}

	private static void selectionSort(int[] arr, int size) {
		// here size-2 because last value can not be sorted and arr length should be -1 so arr.len-1-1 => arrr.len-2
		for(int i=0;i<size-2;i++) {
			int min = i;
			for(int j=i;j<size;j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			swap(arr,i,min);
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

}
