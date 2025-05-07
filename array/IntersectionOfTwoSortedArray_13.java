package array;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArray_13 {

	public static void main(String[] args) {
		// union of two sorted array 
		int arr1[]= {1,2,2,3,3,4,5,6};
		int arr2[] ={2,3,3,5,6,6,7};
		// [2,3,3,5,6]
	
				
		bruteForce(arr1,arr2);
		optimalSol(arr1,arr2);
	}

	// T.C  = O(n1+n2) and S.C = O(1)
	private static void optimalSol(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int i=0;
		int j=0;
		ArrayList<Integer> list = new ArrayList<>();
		while(i < n1 && j < n2) {
			if(arr1[i] < arr2[j]) {
				i++;
			}
			else if(arr2[j] < arr1[i]) {
				j++;
			}else {
				list.add(arr1[i]);
				i++;
				j++;
			}
		}
		System.out.println(list);
	}

	// T.C  = O(n1*n2) and S.C = O(n2)
	private static void bruteForce(int[] arr1, int[] arr2) {
		int visited[] = new int[arr2.length];
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j] && visited[j]==0) {
					visited[j] = 1;
					list.add(arr2[j]);
					break;
				}
				if( arr1[i] < arr2[j]) break;
			}
		}
		System.out.println(list);
	}

}
