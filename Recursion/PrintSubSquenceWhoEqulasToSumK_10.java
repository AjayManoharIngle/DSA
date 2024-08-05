package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSquenceWhoEqulasToSumK_10 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,1}; 
		int sum = 2;
		// {1,1}, {2}
		
		int size = arr.length;
		List<Integer> list = new ArrayList<>();
		
		printSeq(arr,size,0,list,sum);
		
		int calSum = 0;
		printSeq1(arr,size,0,list,sum,calSum);
	}

	private static void printSeq(int[] arr, int size, int i, List<Integer> list, int sum) {
		if(i==size) {
			if(list.size()>0) {
				int getSum = list.stream().reduce(0,Integer::sum);
				if(getSum == sum) {
					System.out.println(list);
				}
			}
		}else {
			list.add(arr[i]);
			printSeq(arr, size, i+1, list,sum);
			
			list.remove(list.size()-1);
			printSeq(arr, size, i+1, list,sum);
		}
	}

	private static void printSeq1(int[] arr, int size, int i, List<Integer> list, int sum, int calSum) {
		if(i==size) {
			if(list.size()>0) {
				if(calSum == sum) {
					System.out.println(list);
				}
			}
			return;
		}else {
			list.add(arr[i]);
			calSum += arr[i];
			printSeq1(arr, size, i+1, list,sum,calSum);
			
			list.remove(list.size()-1);
			calSum -= arr[i];
			printSeq1(arr, size, i+1, list,sum,calSum);
		}
	}
}
