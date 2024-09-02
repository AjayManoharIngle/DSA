package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// bubble sort :  push max number to last and swap adjacent numbers 
		
//		[ 13 46 24 52 20 9 ] 
//		iteration 1 : 
//		13 24 46 52 20 9
//		13 24 46 20 52 9
//		final => 13 24 46 20 9 52 => sorted [52]
		
//		iteration 2 :
//		13 24 20 46 9 52
//		final => 13 24 20 9 46 52 => sorted [46,52]
		
//		iteration 3 :
//		13 20 24 9 46 52
//		final => 13 20 9 24 46 52 => sorted [24,46,52]
		
//		iteration 4 :
//		final => 13 9 20 24 46 52 => sorted [20,24,46,52]
		
//		iteration 5 :
//		final => 9 13 20 24 46 52 => sorted [13,20,24,46,52]
		
//      9 is already sorted =>  [9,13,20,24,46,52]
		
		int arr[] = {13, 46, 24, 52, 20, 9 };
		int size = arr.length;
		
		// O(N ^2 ) = Avg and worst case
		bubbleSort(arr,size);
		
		// if there no swap happed it means array is already soreted 
		// it itakes O(n) for best case
	}

	private static void bubbleSort(int[] arr, int size) {
		// n-1,n-2,n-3,n-4...1 
		for(int i=size-1;i>=1;i--) {
			// should not take first ele cause it is sorted
			int swapsDone = 0;
			for(int j=0;j<i;j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr,j,j+1);
					swapsDone = 1;
				}
			}
			if(swapsDone == 0) {
				break;
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
