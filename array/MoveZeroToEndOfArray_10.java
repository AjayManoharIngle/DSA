package array;

import java.util.Arrays;

public class MoveZeroToEndOfArray_10 {

	public static void main(String[] args) {
		
		/// move zero to end of array 
		int arr[] = {1,0,3,4,0,9,94,0,6,8};
		int len = arr.length;
		System.out.println("array : " + Arrays.toString(arr));
		bruteForce(arr,len);
		optimalSol(arr,len);
	}

	private static void optimalSol(int[] arr, int len) {
		// finding out first zero
		int j=0;
		while(j<len) {
			if(arr[j]==0) {
				break;
			}
			j++;
		}
		
		// swap ele if i is non zero and j is zero put all zeros at end
		int i=j+1;
		while(i<len) {
			if(arr[i]!=0) {
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				j++;
			}
			i++;
		}
		System.out.println(Arrays.toString(arr));
	}

	// T.C= O(n) and S.C= O(n)
	private static void bruteForce(int[] arr, int len) {
		int temp[] = new int[len];
		for(int i=0,j=0;i<len;i++) {
			if(arr[i]!=0) {
				temp[j] = arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(temp));
	}
}
