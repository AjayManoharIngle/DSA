package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermuatationsArrayII_18 {

	public static void main(String[] args) {
		
		// print all permuations of array
		// [1,2,3] => [[1,2,3],[1,3,2],[2,3,1],[2,1,3],[3,1,2],[3,2,1]]
		
		int arr[] = {1,2,3};
		List<List<Integer>> list = new ArrayList<>();
		printAllPermutationArray(arr,0,list);
		System.out.println(list);
	}

	private static void printAllPermutationArray(int[] arr, int i, List<List<Integer>> list) {
		if(i==arr.length) {
			List<Integer> ds = new ArrayList<>();
			for(int k=0;k<arr.length;k++) {
				ds.add(arr[k]);
			}
			list.add(new ArrayList<>(ds));
			return;
		}
		
		for(int j=i;j<arr.length;j++) {
			swap(j,i,arr);
			printAllPermutationArray(arr,i+1,list);
			swap(j,i,arr);
		}
	}

	private static void swap(int j, int i, int[] arr) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

}
