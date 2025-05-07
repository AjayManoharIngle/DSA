package array;

public class MaxConsecuative1s_15 {

	public static void main(String[] args) {
		
		// find out max no of consec 1's in array
		
		int arr[] = {1,0,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1};
		// ans = 6
		
		optimalsol(arr,arr.length);
	}

	private static void optimalsol(int[] arr, int length) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i < length;i++) {
			if(arr[i] == 0) {
				sum = 0;
			}
			else {
				sum += 1;
				max = Math.max(max,sum);
			}
		}
		System.out.println(max);
	}
}
