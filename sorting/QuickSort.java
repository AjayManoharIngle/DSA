package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		// find pivot ele and place it's correct order
		// pivot ele greater than cuurent no => smaller number on left
		// pivot ele smaller than current no => larger number on right
		int arr[]= {13,46, 24, 52, 20, 9};
		int size = arr.length;
		
		// O(nlogn) - best,avg,worst
		quickSort(arr,0, size-1);
		System.out.println(Arrays.toString(arr));
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		while(i < j) {
			// pivot ele is greater than current ele
			while(arr[i]<=pivot && i<=high-1) i++;
			
			// pivot ele is smaller than current ele
			while(arr[j] > pivot && j>=low+1) j--;
			
			if(i < j) swap(arr,i,j);
		}
		swap(arr,j,low);
		return j;
	}

	private static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	private static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pIndex = partition(arr,low,high);
			quickSort(arr,low,pIndex-1);
			quickSort(arr,pIndex+1,high);
		}
	}

}
