package array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateInPalce_5 {

	public static void main(String[] args) {
		
		// remove duplicate ele in place in sorted array
		// and write all unique items in front only and later 
		// values in array can be ignored.
		
		int arr[] = {1,1,1,2,2,2,2,2,3,4,4,34};
		// ans => [1,2,3,4,34,_,_,_,_,_,_,_]=> 5
		
		//bruteForce(arr);
		optimalSol(arr);
	}

	// T.C = O(n) and S.C = O(1)
	private static void optimalSol(int[] arr) {
		int i=0;
		for(int j=1;j<arr.length && i<j;j++) {
			if(arr[i] != arr[j]) {
				arr[i+1] = arr[j];
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Size : " + (i+1));
	}

	// T.C = O(n(logn) + n) and S.C = O(n)
	private static void bruteForce(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int i : arr) {
			set.add(i);
		}
		System.out.println(set);
		int j = 0;
		for(int i : set) {
			arr[j] = i;
			j++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
