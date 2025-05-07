package array;

import java.util.Arrays;

public class MissingNumber_14 {

	public static void main(String[] args) {
		// Number from 1 to n - need to find one missing number 
		
		int arr[] = {1,2,4,5,6};
		int n = 6; // ans = 3
		
		bruteForce(arr,n);
		betterSol(arr,n);
		optimalSol1(arr,n);
		optimalSol2(arr,n);
		optimalSol3(arr,n);
	}

	// MOst optimal sol = T.C = O(n)
	private static void optimalSol3(int[] arr, int n) {
		int xor1 = 0;
		int xor2 = 0;
		for(int i=0;i<n-1;i++) { // o to 3
			xor2 ^= i;
			xor1 ^= (i+1); // 1 to 4
		}
		xor1 ^= n; // add 5 also => 1 to 5
		System.out.println("Missing no : " + (xor1^xor2));
	}

	// xor of same no is 0 and differnt is number only.
	// T.C  = O(2n)
	private static void optimalSol2(int[] arr, int n) {
		int xor1 = 0;
		for(int i=1;i<=n;i++) {
			xor1 ^= i;
		}
		int xor2 = 0;
		for(int i : arr) {
			xor2 ^= i;
		}
		System.out.println("Missing no : " + (xor1^xor2));
	}

	// create hash and if item found in arr mark as 1 and whoever is not 
	// present will be ans 
	// T.C =  O(n) , S.C = O(n)
	private static void betterSol(int[] arr, int n) {
		int hash[] = new int[n+1];
		for(int i : arr) {
			hash[i] = 1;
		}
		for(int i=1;i<hash.length;i++) {
			if(hash[i] == 0) {
				System.out.println("Missing No : " + i);
			}
		}
		
		System.out.println(Arrays.toString(hash));
	}

	// check 1 to n numbers present in given array one by one 
	// T.C =  O(n^2)
	private static void bruteForce(int[] arr, int n) {
		for(int i=1;i<=n;i++) {
			int flag = 0;
			for(int j=0;j<n-1;j++) {
				if(arr[j] == i) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("Missing No : " + i);
			}
		}
	}

	// T.C = O(n)
	private static void optimalSol1(int[] arr,int n) {
		int total = (n * (n+1))/2;
		int sum =0;
		for(int i : arr ) {
			sum+=i;
		}
		System.out.println("Missing no : " + (total-sum));
	}

}
