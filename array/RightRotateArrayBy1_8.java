package array;

import java.util.Arrays;

public class RightRotateArrayBy1_8 {

	public static void main(String[] args) {
		// right rotation by 1 place
		int arr[] = {9,2,3,4,5,2,8}; // [8 9 2 3 4 5]
		RightRotate(arr,arr.length);
	}
	
	// T.C = O(n) , S.C= O(1)
	private static void RightRotate(int[] arr, int len) {
			int t = arr[len-1];
			for(int i=len-2;i>=0;i--) {
				arr[i+1] = arr[i];
			}
			arr[0] = t;
			System.out.println(Arrays.toString(arr));
	}
}
