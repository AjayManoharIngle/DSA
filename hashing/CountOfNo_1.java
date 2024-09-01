package hashing;

public class CountOfNo_1 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,1,3,2};
		
		// count how much 1 appear in array
		normalMethod(arr,1);
		normalMethod(arr,2);
		normalMethod(arr,3);
		// This method will take lot of time if i have count of all numbers 
		// We have Q number and each will execute function of count O(n) => Q * O(n) 
		
		// To reduce such problem we have hashing
		hashMethod(arr);
	}

	private static void hashMethod(int[] arr) {
		// will create hash of mentioned size or max number in array
		int hash[] = new int[100000000];
		for(int i=0;i<arr.length;i++) {
			hash[arr[i]]++;
		}
		System.out.println(hash[1] + " " + hash[2] + " " + hash[3]);
	}

	private static void normalMethod(int[] arr, int n) {
		int c = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == n)
				c++;
		}
		System.out.println("Count of " + n + " is " + c);
	}

}
