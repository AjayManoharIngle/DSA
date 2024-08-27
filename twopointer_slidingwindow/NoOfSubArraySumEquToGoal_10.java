package twopointer_slidingwindow;

public class NoOfSubArraySumEquToGoal_10 {

	public static void main(String[] args) {
		
		// Binary subarrays with sum - no of sub arrays equal to sum
		
		// no of sub array equal to less than sum
		
		int arr[] = {1,0,1,0,1};
		//[1,0,1] [0,1,0,1] [1,0,1] [1,0,1,0]
		int len = arr.length;
		int goal = 2;
		
		// T.C = O(2n) and S.C = O(1)
		int res1 = betterSol(arr,len,goal) - betterSol(arr,len,goal-1);
		System.out.println(res1);
				
	}

	private static int betterSol(int[] arr, int len, int goal) {
		int l=0;
		int r=0;
		int count = 0;
		int sum =0;
		
		if(goal < 0) {
			return 0;
		}
		
		while(r < len) {
			sum += arr[r];
			while(sum > goal && l<= r) {
				sum -= arr[l];
				l++;
			}
			count = count + (r-l+1);
			r++;
		}
		return count;
	}
}
