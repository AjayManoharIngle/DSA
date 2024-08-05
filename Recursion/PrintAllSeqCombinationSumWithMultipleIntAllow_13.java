package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSeqCombinationSumWithMultipleIntAllow_13 {

	public static void main(String[] args) {
		
		// array has distinct number and return all possible 
		// combination sum which allow to take multiple integers.
		
		int arr[] = {2,3,6,7};
		int target=7;
		
		// output :[ [2,2,3], [7] ]
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		
		combinationSum(arr,target,list,ds,0);
		System.out.println(list);
		
	}

	// T.C = O(2^n * k) n is no of array and k is times elemnts taken
	private static void combinationSum(int[] arr, int target, List<List<Integer>> list, List<Integer> ds, int i) {
		if(i==arr.length) {
			if(target == 0) {
				list.add(new ArrayList<>(ds));
			}
			return;
		}
		
		if(arr[i] <= target) {
			ds.add(arr[i]);
			// take elemets till you find target 0 or array index ele less than target
			combinationSum(arr, target-arr[i], list, ds, i);
			
			ds.remove(ds.size()-1);
		}
		combinationSum(arr, target, list, ds, i+1);
	}

}
