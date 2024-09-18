package array;

import java.util.Arrays;

public class RightRotateArrayByK_9 {

	public static void main(String[] args) {
		
		int arr[] = {9,2,3,4,5,8,9,888,99};
		int k =3;
		
		optimalSol(arr,arr.length,k);
	}

	private static void optimalSol(int[] arr, int length, int k) {
		reverse(arr,0,length-k-1);
		reverse(arr,length-k,length-1);
		reverse(arr,0,length-1);
		System.out.println(Arrays.toString(arr));
	}
	

	private static void reverse(int[] arr, int start, int end) {
		while(start<=end) {
			int t = arr[start];
			arr[start] = arr[end];
			arr[end] = t;
			start++;
			end--;
		}
	}
}
