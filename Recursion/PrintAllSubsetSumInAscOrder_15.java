package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllSubsetSumInAscOrder_15 {

	public static void main(String[] args) {
		
		// print all subset with sum in increasing order
		int arr[] = {2,3};
		// {0,2,3,{2,3}} => O/P => [0,2,3,5]
		
		int size = arr.length;
		List<Integer> list = new ArrayList<>();
		List<Integer> collectList = new ArrayList<>();
		allSubsetSum(arr,size,list,0,0,collectList);
		Collections.sort(collectList);
		System.out.println(collectList);
		
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

	private static void allSubsetSum(int[] arr, int size, List<Integer> list, int i, int sum, List<Integer> collectList) {
		if(i == size) {
			if(list.size() > 0) {
				collectList.add(sum);
			}else {
				collectList.add(0);
			}
		}else {

			sum += arr[i];
			list.add(arr[i]);
			allSubsetSum(arr, size, list, i+1,sum,collectList);
			
			sum -= arr[i];
			list.remove(list.size()-1);
			allSubsetSum(arr, size, list, i+1,sum,collectList);
		}
	}

}
