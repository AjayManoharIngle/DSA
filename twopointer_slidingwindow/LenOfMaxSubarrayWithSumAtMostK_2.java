package twopointer_slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class LenOfMaxSubarrayWithSumAtMostK_2 {

	public static void main(String[] args) {
	
		// Generate all the subarrays, and 
		// keep updating the largest subarray whose sum is less than or equal to K
		
		int arr[] = {1,2,1,3,4,8,5};
		int size = arr.length;
		int k = 5;
		
		// Brute force = T.C = O(n^2) and S.C = O(1)
		findLenOfSubArrayAtMostK(arr,size,k);
		// OP - MaxLen of array: 3 = list : [[1, 2, 1], [2, 1], [1, 3], [3], [4], [5]]

		
		// T.C = O(n+n) and S.C = O(1)
		betterSolution(arr,size,k);
		// OP - MaxLen of array: 3
		
		// T.C = O(n) and S.C = O(1)
		optimalSolution(arr,size,k);
		// OP - MaxLen of array: 3
	}

	private static void optimalSolution(int[] arr, int size, int k) {
		int l = 0;
		int r = 0;
		int sum = 0;
		int maxLen = Integer.MIN_VALUE;
		
		while(r < size) {
			sum = sum + arr[r];
			// don't shrink till condition match, shrink only onces so maxlen window match 
			if(sum > k) {
				sum = sum - arr[l];
				l++;
			}
			if(sum <= k) {
				maxLen = Math.max(maxLen,r-l+1);
			}
			r++;
		}
		
		System.out.println("MaxLen of array: " + maxLen );
	}

	private static void betterSolution(int[] arr, int size, int k) {
		int l = 0;
		int r = 0;
		int sum = 0;
		int maxLen = Integer.MIN_VALUE;
		
		while(r < size) {
			sum = sum + arr[r];
			while(sum > k) {
				sum = sum - arr[l];
				l++;
			}
			if(sum <= k) {
				maxLen = Math.max(maxLen,r-l+1);
			}
			r++;
		}
		
		System.out.println("MaxLen of array: " + maxLen );
	}

	private static void findLenOfSubArrayAtMostK(int[] arr, int size, int k) {

		int maxLen = Integer.MIN_VALUE;
		List<List<Integer>> ans = new ArrayList<>();
		
		for(int i=0;i<size;i++) {
			int sum = 0;
			List<Integer> list = new ArrayList<>();
			for(int j=i;j<size;j++) {
				sum = sum + arr[j];
				if(sum <= k) {
					maxLen = Math.max(maxLen,(j-i+1));
				}else {
					break;
				}
				list.add(arr[j]);
			}
			if(list.size() > 0) ans.add(list);
		}
		System.out.println("MaxLen of array: " + maxLen + " = list : " + ans);
	}
}
