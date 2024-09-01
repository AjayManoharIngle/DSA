package hashing;

import java.util.HashMap;

public class CountNoUseHashMap_3 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,1,3,2};
		
		hashMethod1(arr);
	}

	private static void hashMethod1(int[] arr) {
		// no need to declre hash value at max - dynamic create
		// [key,value] => [no,freq]
		// value in soreted order
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		System.out.println(map.get(1) + " " + map.get(2) + " " + map.get(3));
	}

}
