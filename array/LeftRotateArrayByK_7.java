package array;

import java.util.Arrays;

public class LeftRotateArrayByK_7 {

	public static void main(String[] args) {
		// left rotate by k place
		
		int arr[] = {1,2,3,4,5,6};
		int k = 3;
		//leftRotateByK(arr,arr.length,k);
		// arr length = 6 and k=9
		// 9-6 = 3 it means left by 3 places is equals to 9 times places
		
		//BruteForce(arr,arr.length,k);
		optimalSol(arr,arr.length,k);
	}

	private static void optimalSol(int[] arr, int length, int k) {
		reverse(arr,0,k-1);
		reverse(arr,k,length-1);
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

	// T.C = O(k+n-k+n)=n and S.C = O(n)
	private static void BruteForce(int[] arr, int length, int k) {
		k = k % length;
		
		// copy k ele in temp
		int[] temp = new int[k];
		for(int i=0;i<k;i++) {
			temp[i] = arr[i];
		}
		
		// shift k+1 to n ele in arr
		for(int i=k;i<length;i++) {
			arr[i-k] = arr[i];
		}
		
		// push back temp to arr at end
		for(int i=length-k;i<length;i++) {
			arr[i] = temp[i-(length-k)];
		}
		
		System.out.println(Arrays.toString(arr));
	}

	// T.C = O(k*n)
	private static void leftRotateByK(int[] arr, int length, int k) {
		k = k%length;
		int j=0;
		while(j < k) {
			int t = arr[0];
			for(int i=1;i<length;i++) {
				arr[i-1] = arr[i];
			}
			arr[length-1] = t;
			j++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
