package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllUniqueSubsetSumContainMultipleIntAllowInArr_16 {

	public static void main(String[] args) {
		
		// array contains duplicate numbers
		// print all subset but unique
		
		int arr[] = {1,2,2};
		// {[],1,2,[1,2],[2,2],[1,2,2]}
		
		Arrays.sort(arr);
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		subsetSum(ds,list,0,arr);
		System.out.println(list);
		
	}

	// T.C = O(2^n * n )
	private static void subsetSum(List<Integer> ds, List<List<Integer>> list, int i, int[] arr) {
		list.add(new ArrayList<>(ds));
			
		// loop from index i=0 to len then i=1 to len again i=2 to len...
		for(int j=i;j<arr.length;j++) {
			
			// do not pick same element
			if(j !=i && arr[j] == arr[j-1]) continue;
			
			ds.add(arr[j]);
			subsetSum(ds, list, j+1, arr);
			ds.remove(ds.size()-1);
		}
	}
	
	
}
