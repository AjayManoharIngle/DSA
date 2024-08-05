package Recursion;

import java.util.Arrays;

public class ReverseArray_6 {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,2,33,4,5,5,6,66};
		int brr[] = new int[arr1.length];
		int arr2[] = {1,2,2,33,4,5,5,6,66};
		int arr3[] = {1,2,2,33,4,5,5,6,66};
		
	    System.out.println(Arrays.toString(reverseArray(arr1,brr,arr1.length-1,0)));
	    System.out.println(Arrays.toString(reverseArray1(arr2,0,arr2.length-1)));
	    System.out.println(Arrays.toString(reverseArray2(arr3,0)));
	}

	// copy one arr to another arr with same size in reverse = S.C =O(n)
	private static int[] reverseArray(int[] arr, int[] brr, int i,int j) {
		if(j > arr.length || i < 0) {
			return brr;
		}else if(arr.length == 0 ) {
			return arr;
		}
		brr[i] = arr[j];
		return reverseArray(arr, brr,i-1,j+1);
	}
	
	// use existing array S.C = O(1)
	private static int[] reverseArray1(int[] arr, int i,int j) {
		if(i >= j) return arr ;
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
		return reverseArray1(arr,i+1,j-1);
	}
	
	// using one pointer only 
	private static int[] reverseArray2(int[] arr, int i) {
		if(i >= (arr.length/2)) return arr ;
		int t = arr[i];
		arr[i] = arr[arr.length-i-1];
		arr[arr.length-i-1] = t;
		return reverseArray2(arr,i+1);
	}
}
