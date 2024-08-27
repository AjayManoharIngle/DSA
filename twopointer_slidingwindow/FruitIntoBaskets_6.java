package twopointer_slidingwindow;

import java.util.HashMap;
import java.util.HashSet;

public class FruitIntoBaskets_6 {

	public static void main(String[] args) {
		
		// get max length of subarray with at most two types of numbers.
		
		int arr[] = {3,3,3,1,2,1,1,2,3,3,4};
		// 1st basket contain -> [3,3,3]
		// 2nd basket contain -> [1]
		// [3,3,3,1][2] => it is not allowed 
		// each basket contain unique ele => subarray len = 4
		
		// 1st basket contain -> [1,1,1]
		// 2nd basket contain -> [2,2]
		// subarry = [1,2,1,1,2] => len is 5
		
		int k = 2;
		
		// T.C = O(n^2) and S.C = O(1)
		bruteForce(arr,arr.length,k);
		
		// T.C = O(2n) and S.C = O(1)
		betterSolution(arr,arr.length,k);
		
		// T.C = O(n) and S.C = O(1)
		optimalSolution(arr,arr.length,k);
		
		// OP : Maxlen : 5
	}

	private static void optimalSolution(int[] arr, int length, int k) {
		int l = 0;
		int r = 0;
		int maxLen = Integer.MIN_VALUE;
		HashMap<Integer,Integer> map = new HashMap<>();
		while(r < length) {
			map.put(arr[r],map.getOrDefault(arr[r],0)+1);
			if(map.size() > k) {
				map.put(arr[l],map.get(arr[l])-1);
				if(map.get(arr[l])==0) {
					map.remove(arr[l]);
				}
				l++;
			}
			if(map.size() <= k) {
				maxLen = Math.max(maxLen,r-l+1);
			}
			r++;
		}
		System.out.println("Maxlen : " + maxLen);
	}

	private static void betterSolution(int[] arr, int length, int k) {
		int l = 0;
		int r = 0;
		int maxLen = Integer.MIN_VALUE;
		HashMap<Integer,Integer> map = new HashMap<>();
		while(r < length) {
			map.put(arr[r],map.getOrDefault(arr[r],0)+1);
			while(map.size() > k) {
				map.put(arr[l],map.get(arr[l])-1);
				if(map.get(arr[l])==0) {
					map.remove(arr[l]);
				}
				l++;
			}
			if(map.size() <= k) {
				maxLen = Math.max(maxLen,r-l+1);
			}
			r++;
		}
		System.out.println("Maxlen : " + maxLen);
	}

	private static void bruteForce(int[] arr, int length, int k) {
		int maxLen = 0;
		for(int i=0;i<arr.length;i++) {
			HashSet<Integer> set =  new HashSet<>();
			for(int j=i;j<arr.length;j++) {
				set.add(arr[j]);
				if(set.size() <= k) {
					maxLen = Math.max(maxLen, j-i+1);
				}else {
					break;
				}
				System.out.println(set);
			}
		}
		System.out.println("Maximum len : " + maxLen);
	}
}
