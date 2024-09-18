package array;

import java.util.Arrays;

public class LeftRotateArrayBy1_6 {

	public static void main(String[] args) {
		
		// left rotation by 1 place
		int arr[] = {9,2,3,4,5,8}; // [2 3 4 5 1]
		// 21345
		// 23145
		// 23415
		// 23451
		
		leftRotate1(arr);
		leftRotate2(arr);
	}

	// T.C = O(n) , S.C= O(1)
	private static void leftRotate2(int[] arr) {
		int t = arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = t;
		System.out.println(Arrays.toString(arr));
	}

	// extra swaps happend 
	private static void leftRotate1(int[] arr) {
		for(int i=0,j=1;i<j && j<arr.length;i++,j++) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
		}
		System.out.println(Arrays.toString(arr));
	}
}
