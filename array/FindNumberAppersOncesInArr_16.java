package array;

public class FindNumberAppersOncesInArr_16 {

	public static void main(String[] args) {
		
		// find number in array where every ele is occurs twice
		
		int arr[] = {1,1,2,2,3,3,4,5,5,6,6};
		int len = arr.length;
		
		bruteForce(arr,len);
		betterSol(arr,len);
		optimalSol(arr,len);
	}

	// T.C  = O(n) and S.C = O(1)
	private static void optimalSol(int[] arr, int len) {
		int xor = 0;
		for(int i : arr) {
			xor ^= i;
		}
		System.out.println("One ele : "+ xor);
	}

	// T.C  = O(n) and S.C = O(max(n))
	private static void betterSol(int[] arr, int len) {
		int max = Integer.MIN_VALUE;
		for(int i : arr) {
			max = Math.max(max,i);
		}
		int hash[] = new int[max+1];
		for(int i=0;i<len;i++) {
			hash[arr[i]]++;
		}
		for(int i=0;i<len;i++) {
			if(hash[arr[i]] == 1) {
				System.out.println("No : " + arr[i]);
			}
		}
	}

	// T.C  = O(n^2) and S.C = O(1)
	private static void bruteForce(int[] arr, int len) {
		for(int i=0;i<len;i++) {
			int count =0;
			for(int j=0;j<len;j++) {
				if(arr[i] == arr[j]) count++;
				if(count > 1) break; 
			}
			if(count == 1) {
				System.out.println("No :" + arr[i]);
				break;
			}
		}
	}

}
