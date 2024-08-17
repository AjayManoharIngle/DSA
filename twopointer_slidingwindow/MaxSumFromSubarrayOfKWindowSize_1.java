package twopointer_slidingwindow;

public class MaxSumFromSubarrayOfKWindowSize_1 {

	public static void main(String[] args) {
		
		// get maximum sum from sub array where window size is mentioned 
		
		int window_size = 2;
		int arr[] = {2, 3, 4, 5,1};
		
		getMaxSum1(window_size, arr.length,arr);
		// OP - Maximum sum : 9
		
	}

	//T.C = O(n) and S.C = O(1)
	private static void getMaxSum1(int window_size, int length,int arr[]) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int l=0;
		int r=window_size-1;
		while(r < length-1) {
			sum = getSum(l,r,arr);
			sum = sum - arr[l]; 
			l++;
			r++;
			sum = sum + arr[r];
			max = Math.max(max, sum);
		}
		
		System.out.println("Maximum sum : " + max);
	}

	private static int getSum(int l, int r, int arr[]) {
		int sum =0;
		for(int i=l;i<=r;i++) {
			sum += arr[i];
		}
		return sum;
	}

}
