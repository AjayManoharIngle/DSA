package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllSeqCombinationSumWithUniqueIntAllowAndInlexigraphyOrder_14 {

	public static void main(String[] args) {
		
		// array has double number and return all possible 
		// combination sum which allow to take unique combination
		// and in lexigraphic order 
		
		int arr[] = {1,1,1,2,2,3};
		int target=4;
		
		// output :[ [2,2,3], [7] ]
		Arrays.sort(arr);
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		combinationSeq(ds,list,0,target,arr);
		System.out.println(list);
		
	}

	// T.C = O(2^n)
	private static void combinationSeq(List<Integer> ds, List<List<Integer>> list, int i, int target, int[] arr) {
		if(target == 0) {
			list.add(new ArrayList<>(ds));
			return;
		}
		
		// loop from index i=0 to len then i=1 to len again i=2 to len...
		for(int j=i;j<arr.length;j++) {
			
			// do not pick same element
			if(j > i && arr[j] == arr[j-1]) continue;
			
			// target is less then other index combination not possible
			if(arr[j] > target) break;
			
			ds.add(arr[j]);
			combinationSeq(ds, list, j+1, target-arr[j], arr);
			ds.remove(ds.size()-1);
		}
	}
}
