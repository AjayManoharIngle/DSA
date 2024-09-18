package array;

public class LargestNo_1 {

	public static void main(String[] args) {
		
		// find largest number in array :
		int arr[] = {12,23,22,345,55,0,10000};
		int len = arr.length;
		
		// T.C = O(n) and S.C = O(1)
		largeNo(arr,len);
	}

	private static void largeNo(int[] arr, int len) {
		if(len == 0)
			System.out.println("Array can not be empty");
		else {
			int max = arr[0];
			for(int i : arr) {
				if(max < i) {
					max = i;
				}
			}
			System.out.println("Max Value : " + max);
		}
	}

}
