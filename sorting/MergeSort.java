package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int arr[] = {13, 46, 24, 52, 20, 9 };
		int size = arr.length;
		
		// best,avg,worst - O(nlogn) and S.C= O(n)
		mergeSort(arr,0,size-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr, int low, int high) {
		if(low == high) return ;
		int mid = (low+high)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr,mid+1, high);
		merge(arr,low,mid,high);
		
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int left = low;
		int right =mid+1;
		ArrayList<Integer> temp = new ArrayList<>();
		
		// sort parttion array 
		while(left<=mid && right<=high) {
			if(arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			}else {
				temp.add(arr[right]);
				right++;
			}
		}
		
		// put left remaining sorted data on temp array
		while(left <= mid) {
			temp.add(arr[left]);
			left++;
		}
		
		// put right remaining sorted data on temp array
		while(right <= high) {
			temp.add(arr[right]);
			right++;
		}
		
		for(int i=low;i<=high;i++) {
			arr[i] = temp.get(i-low);
		}
	}
}
