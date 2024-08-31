package twopointer_slidingwindow;

import java.util.HashMap;
import java.util.HashSet;

public class NoOfSubArrayWithKDistinctInteger_12 {

	public static void main(String[] args) {
		
		// count no of subarray which has distinct intgers
		// [2,1,3] [1,3,4] [1,2,1,3] => 3
		int arr[] = {1,2,1,3,4};
		int len = arr.length;
		int k = 3;
		// k is distinct integer in subarray
		
		//T.C = O(n^2) and S.C = O(1)
		bruteForce(arr,len,k);
		
		int res = betterSol(arr,len,k) - betterSol(arr, len, k-1);
		System.out.println(res);
	}

	private static int betterSol(int[] arr, int len, int k) {
		int l = 0;
		int r = 0;
		int maxLen = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		while(r < len) {
			map.put(arr[r],map.getOrDefault(arr[r],0)+1);
			while(map.size() > k) {
				map.put(arr[l],map.get(arr[l])-1);
				if(map.get(arr[l])==0) {
					map.remove(arr[l]);
				}
				l++;
			}
			maxLen = maxLen + (r-l+1);
			r++;
		}
		return maxLen;
	}

	private static void bruteForce(int[] arr, int len, int k) {
		int count = 0;
		for(int i=0;i<len;i++) {
			HashSet<Integer> set = new HashSet<>();
			int distinctCount = 0;
			for(int j=i;j<len;j++) {
				set.add(arr[j]);
				if(set.size() == k) {
					distinctCount++;
				}else if(set.size()>k){
					break;
				}
			}
			count += distinctCount;
		}
		System.out.println(count);
	}
}
