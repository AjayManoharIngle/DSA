package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutationsArrayI_17 {

	public static void main(String[] args) {
		
		// print all permuations of array
		// [1,2,3] => [[1,2,3],[1,3,2],[2,3,1],[2,1,3],[3,1,2],[3,2,1]]
		
		int arr[] = {1,2,3};
		List<Integer> ds = new ArrayList<>();
		List<List<Integer>> list = new ArrayList<>();
		boolean[] flag = new boolean[arr.length];
		printAllPermutationArray(arr,flag,ds,list);
		System.out.println(list);
	}

	// T.C = O(N!*N) and S.C = O(n)+O(n)
	private static void printAllPermutationArray(int[] arr, boolean[] flag, List<Integer> ds, List<List<Integer>> list) {
		if(ds.size()==arr.length) {
			list.add(new ArrayList<>(ds));
			return;
		}
		for(int i=0;i<arr.length;i++) {
			if(!flag[i]) {
				flag[i] = true;
				printAllPermutationArray(arr, flag, ds, list);
				ds.add(arr[i]);
				printAllPermutationArray(arr, flag, ds, list);
				ds.remove(ds.size()-1);
				flag[i]=false;
			}
		}
		
	}
}
