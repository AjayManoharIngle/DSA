package array;

public class SecondLargestNo_2 {

	public static void main(String[] args) {
		
		// find second largest ele in array
		
		int arr[] = {1,2,3,3,34,4,100,134,134,120};
		int size= arr.length;
		
		// T.C = O(n) and S.C = O(1)
		secondLargeNo(arr,size);
	}

	private static void secondLargeNo(int[] arr, int size) {
		int max = arr[0];
		int secondMax = -1;
		for(int i : arr) {
			if(max < i) {
				secondMax = max;
				max = i;
			}
			else if(i<max && i>secondMax){
				secondMax = i;
			}
		}
		System.out.println("Second Max Value : " + secondMax);
	}
}
