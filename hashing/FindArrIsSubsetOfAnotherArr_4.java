package hashing;

import java.util.HashMap;
import java.util.HashSet;

public class FindArrIsSubsetOfAnotherArr_4 {

	public static void main(String[] args) {
		
		int arr1[] = {11, 1, 13, 21, 3, 7};
		int arr2[] = {11, 3, 7, 1,0};
		// each array has distinct ele
		
		hashMethod(arr1,arr2);
	}

	private static void hashMethod(int[] arr1, int[] arr2) {
		HashSet<Integer> set = new HashSet<>();
		for(int i : arr1) {
			set.add(i);
		}
		
		boolean status = true;
		for(int i : arr2) {
			if(!set.contains(i)) {
				status = false;
			}
		}
		
		System.out.println(status ? "YES" : "NO");
		
	}

}
