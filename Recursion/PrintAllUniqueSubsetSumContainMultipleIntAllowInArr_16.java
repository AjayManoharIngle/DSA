package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllUniqueSubsetSumContainMultipleIntAllowInArr_16 {

	public static void main(String[] args) {
		
		// array contains duplicate numbers
		// print all subset but unique
		
		int arr[] = {1,2,2};
		// {[],1,2,[1,2],[2,2],[1,2,2]}
		
		int size = arr.length;
		
		List<Integer> list1 = new ArrayList<>();
		subsetSum(arr,size,0,0,list1);
		Collections.sort(list1);
		System.out.println(list1);
		
	}

	// O(2^n)
	private static void subsetSum(int[] arr, int size, int i,int sum, List<Integer> list1) {
		if(i == size) {
			list1.add(sum);
			return ;
		}
		subsetSum(arr, size, i+1,sum+arr[i],list1);
		subsetSum(arr, size, i+1, sum,list1);
	}

}
