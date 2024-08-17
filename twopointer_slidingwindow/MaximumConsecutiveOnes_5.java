package twopointer_slidingwindow;

public class MaximumConsecutiveOnes_5 {

	public static void main(String[] args) {
		// you have number between 1 and 0 and you can flip zeroes o 1 
		// so that u will get max number ones consective 
		
		// This ques can be like this find longest subarray with 
		// at most k zeroe's
		
		int arr[] = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		
		//brute force = T.C = O(n^2) and S.C = O(1)
		fingMaxConseOnes(arr,arr.length,k);
		
		// better solution : T.C = O(n)+O(n)=O(2n) and S.C = O(1)
		betterSolution(arr,arr.length,k);
		
		// Optimal Solution  : T.C = O(n) and S.C  = O(1)
		optimalSolution(arr,arr.length,k);
		//Get Max Consec One's : 6
	}

	private static void optimalSolution(int[] arr, int length, int k) {
		int l = 0;
		int r = 0;
		int countZero = 0;
		int maxLen = Integer.MIN_VALUE;
		
		while(r < length) {
			if(arr[r] == 0) {
				countZero++;
			}
			// move left by one only not shrink all
			if(countZero > k) {
				if(arr[l] == 0) countZero--;
				l++;
			}
			
			if(countZero <= k) {
				maxLen = Math.max(maxLen,r-l+1);
			}
			r++;
		}
		System.out.println("Get Max Consec One's : " + maxLen);
	}

	private static void betterSolution(int[] arr, int length, int k) {
		int l = 0;
		int r = 0;
		int countZero = 0;
		int maxLen = Integer.MIN_VALUE;
		
		while(r < length) {
			if(arr[r] == 0) {
				countZero++;
			}
			while(countZero > k) {
				if(arr[l] == 0) countZero--;
				l++;
			}
			
			if(countZero <= k) {
				maxLen = Math.max(maxLen,r-l+1);
			}
			r++;
		}
		System.out.println("Get Max Consec One's : " + maxLen);
	}

	private static void fingMaxConseOnes(int[] arr, int length, int k) {
		int maxLen = Integer.MIN_VALUE;
		for(int i=0;i<length;i++) {
			int countZero =0;
			for(int j=i;j<length;j++) {
				if(arr[j]==0) {
					countZero++;
				}
				
				if(countZero <= k) {
					maxLen = Math.max(maxLen, j-i+1);
				}else {
					break;
				}
			}
		}
		System.out.println("Get Max Consec One's : " + maxLen);
	}

}
