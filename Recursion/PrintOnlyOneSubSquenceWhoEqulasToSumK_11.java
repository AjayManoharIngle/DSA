package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintOnlyOneSubSquenceWhoEqulasToSumK_11 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,1}; 
		int sum = 2;
		
		int size = arr.length;
		List<Integer> list = new ArrayList<>();
		
		int calSum = 0;
		printSeq1(arr,size,0,list,sum,calSum);
	}

	private static boolean printSeq1(int[] arr, int size, int i, List<Integer> list, int sum, int calSum) {
		if(i==size) {
			if(list.size()>0) {
				if(calSum == sum) {
					System.out.println(list);
					return true;
				}
				else {
					return false;
				}
			}
		}else {
			list.add(arr[i]);
			calSum += arr[i];
			if(printSeq1(arr, size, i+1, list,sum,calSum)) {
				return true;
			}
			
			list.remove(list.size()-1);
			calSum -= arr[i];
			if(printSeq1(arr, size, i+1, list,sum,calSum)) {
				return true;
			}
		}
		return false;
	}
}
