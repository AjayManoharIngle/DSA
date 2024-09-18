package hashing;

import java.util.HashMap;

class StoreIndex { 
	int firstIndex;
	int lastIndex;
	
	public StoreIndex(int firstIndex, int lastIndex) {
		super();
		this.firstIndex = firstIndex;
		this.lastIndex = lastIndex;
	}
}

public class MaxDistanceTwoOccOfSameEleInArr_5 {

	public static void main(String[] args) {
		// array with repeated elements, the task 
		// is to find the maximum distance between two occurrences of an element.
		
		int arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
		// Output: 10
		// maximum distance for 2 is 11-1 = 10 
		// maximum distance for 1 is 4-2 = 2 
		// maximum distance for 4 is 10-5 = 5 
	
		hashMethod1(arr);
		hashMethod2(arr);
	}
	
	private static void hashMethod2(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i],i);
			}else {
				max = Math.max(max, i-map.get(arr[i]));
			}
		}
		System.out.println(max);
	}

	private static void hashMethod1(int[] arr) {
		HashMap<Integer,StoreIndex> map = new HashMap<>();
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				StoreIndex s = map.get(arr[i]);
				s.lastIndex = i;
				map.put(arr[i],s);
			}else {
				map.put(arr[i],new StoreIndex(i,0));
			}
			StoreIndex s = map.get(arr[i]);
			max = Math.max(max,s.lastIndex-s.firstIndex);
		}
		System.out.println(max);
	}

}
