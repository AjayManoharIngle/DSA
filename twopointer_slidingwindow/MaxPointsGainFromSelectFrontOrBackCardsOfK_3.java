package twopointer_slidingwindow;

public class MaxPointsGainFromSelectFrontOrBackCardsOfK_3 {

	public static void main(String[] args) {
		// get maximum points from selected cards k 
		// you can select cards from front or back of K size only.
		
		int arr[] = {1,2,3,4,5,6,1};
		int size = arr.length;
		int k = 3;
		
		// [1,2,3] [] => 6 = 6
		// [1,2] [1] => 3+1 = 4
		// [1] [6,1] => 1+7 = 8
		// [] [5,6,1] => 12 = 12
		// max is 12 points you will get if u select 5,6,1 card
		
		getMaxPointsFromCards(k,arr,size);
	}

	// T.C = O(k) and S.C = O(1)
	private static void getMaxPointsFromCards(int k, int[] arr, int size) {
		int lsum = getSum(0,k,arr);
		int maxSum = lsum;
		int rsum = 0;
		
		for(int i=k-1,r=size-1;i>=0;i--,r--) {
			lsum = lsum - arr[i];
			rsum = rsum + arr[r];
			maxSum =Math.max(maxSum,lsum+rsum);
		}
		
		System.out.println("Max Points  : " + maxSum);
	}

	private static int getSum(int l, int k,int arr[]) {
		int sum = 0;
		for(int i=l;i<k;i++) {
			sum += arr[i];
		}
		return sum;
	}

}
