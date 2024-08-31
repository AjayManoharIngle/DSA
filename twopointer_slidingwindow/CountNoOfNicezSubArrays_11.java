package twopointer_slidingwindow;

public class CountNoOfNicezSubArrays_11 {

	public static void main(String[] args) {
		
		// k is count of odd no in sub array 
		// you need find count of sub-array which has k no of odd numbers in subarray
		// you called that array as nice array
		
		int arr[] = {1,1,2,1,1};
		int len = arr.length;
		int k =3;
		
		bruteForce(arr,len,k);
		
		// this problem is simmlar like bianry number with sum means count subarrys with sum
		// here just you need convert odd numbers to 1 and even numbers to 0
		
		int res = betterSol(arr, len, k)-betterSol(arr, len, k-1);
		System.out.println("Count of nice subarray : " + res);

	}
	
	// T.C = O(n) and S.C = O(1)
	private static int betterSol(int[] arr, int len, int goal) {
		int l=0;
		int r=0;
		int count = 0;
		int sum =0;
		
		if(goal < 0) {
			return 0;
		}
		
		while(r < len) {
			sum += (arr[r]%2);
			while(sum > goal && l<= r) {
				sum -= (arr[l]%2);
				l++;
			}
			count = count + (r-l+1);
			r++;
		}
		return count;
	}

	// T.C = O(n^2) and S.C = O(1)
	private static void bruteForce(int[] arr, int len,int k) {
		int count = 0;
		for(int i=0;i<len;i++) {
			int oddNo = 0;
			for(int j=i;j<len;j++) {
				if(arr[j] %2 != 0) {
					oddNo += 1;
					if(oddNo == k) {
						count++;
					}					
				}
				if(oddNo == k && arr[j] %2 == 0) {
					count++;
				}
			}
		}
		System.out.println("Count of nice subarray : " + count);
	}

}
