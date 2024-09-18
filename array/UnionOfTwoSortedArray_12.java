package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoSortedArray_12 {

	public static void main(String[] args) {
		
		// union of two sorted array 
		int arr1[]= {1,1,2,3,4,4,5};
		int arr2[] = {2,3,4,4,4,5,8};
		
		bruteForce(arr1,arr2);
		optimalSol(arr1,arr2);
	}

	// T.C = O(n1+n2) and S.C = O(n1+n2)
	private static void optimalSol(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int i=0,j=0;
		ArrayList<Integer> union = new ArrayList<>();
		while(i < n1 && j < n2) {
			if(arr1[i] <= arr2[j]) {
				if(union.size()==0 || union.get(union.size()-1)!=arr1[i]) {
					union.add(arr1[i]);
				}
				i++;
			}else {
				if(union.size()==0 || union.get(union.size()-1)!=arr2[j]) {
					union.add(arr2[j]);
				}
				j++;
			}
		}
		
		while(i < n1) {
			if(union.size()==0 || union.get(union.size()-1)!=arr1[i]) {
				union.add(arr1[i]);
			}
			i++;
		}
		while(j < n2) {
			if(union.size()==0 || union.get(union.size()-1)!=arr2[j]) {
				union.add(arr2[j]);
			}
			j++;
		}
		
		System.out.println(union);
	}

	// T.C = O(n1logn1+n2lognn2) and S.C = O(n1+n2)
	private static void bruteForce(int[] arr1, int[] arr2) {
		HashSet<Integer> set = new HashSet<>();
		for(int i : arr1) {
			set.add(i);
		}
		
		for(int i : arr2) {
			if(!set.contains(i)) {
				set.add(i);
			}
		}

		System.out.println(set.stream().sorted((p,q) -> p-q).toList());
	}

}
