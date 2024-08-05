package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CountSubSquenceWhoEqulasToSumK_12 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,1}; 
		int sum = 2;
		
		int size = arr.length;
		List<Integer> list = new ArrayList<>();
		
		int calSum = 0;
		int count = printSeq(arr,size,0,list,sum,calSum,0);
		System.out.println(count);
		
		int counts = printSeq1(arr,size,0,sum,0);
		System.out.println(counts);
	}
	

	private static int printSeq1(int[] arr, int size, int i, int sum, int calSum) {
		if(calSum > sum ) return 0;
		if(i==size) {
			if(sum == calSum) return 1;
			else return 0;
		}
		calSum += arr[i];
		int l = printSeq1(arr, size, i+1, sum, calSum);
		calSum -= arr[i];
		int r = printSeq1(arr, size, i+1, sum, calSum);
		return l+r;
	}


	private static int printSeq(int[] arr, int size, int i, List<Integer> list, int sum, int calSum, int count) {
		if(i==size) {
			if(list.size()>0) {
				if(calSum == sum) {
					count++;
					System.out.println(list + " : " + count) ;
				}
			}
		}else {
			list.add(arr[i]);
			calSum += arr[i];
			count = printSeq(arr, size, i+1, list,sum,calSum,count);
			
			list.remove(list.size()-1);
			calSum -= arr[i];
			count = printSeq(arr, size, i+1, list,sum,calSum,count);	
		}
		return count;
	}
}
