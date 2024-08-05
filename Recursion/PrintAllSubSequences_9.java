package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubSequences_9 {

	public static void main(String[] args) {
		
		// Sub Sequence -> it is contiguous and non-contiguous sequence,
		// follows the orders.
		
		// [3,1,2] => [{},3,1,2,(3,1),(1,2),(3,2),(3,1,2)]=> 8
		
		int arr[] = {3,1,2,9};
		int size = arr.length;
		List<Integer> list = new ArrayList<>();
		
		printSeq(arr,list,size,0);
		
	}

	// T.C = O(2^n), S.C = O(n)
	private static void printSeq(int[] arr, List<Integer> list, int size, int i) {
		if(i==size) {
			if(list.size() > 0) {
				System.out.println(list);
			}else {
				System.out.println("{}");
			}
			return;
		}else {
			// Subsequence without including  the element at current index
			list.add(arr[i]);
			printSeq(arr, list, size, i+1);
			
			// Backtrack to remove the recently inserted element
			list.remove(list.size()-1);
			printSeq(arr, list, size, i+1);
		}
		return;
	}
}
