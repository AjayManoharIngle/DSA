package array;

public class SecondSmallestNo_3 {

	public static void main(String[] args) {
		
		// find second largest ele in array
		
		int arr[] = {1,1,1,1,2,3,3,34,4,100,134,134,120};
		int size= arr.length;
		
		// T.C = O(n) and S.C = O(1)
		secondSmallestNo(arr,size);
	}

	private static void secondSmallestNo(int[] arr, int size) {
		int min = arr[0];
		int secondMin = Integer.MAX_VALUE;
		for(int i : arr) {
			if(min > i) {
				secondMin = min;
				min = i;
			}
			else if(i>min && i<secondMin){
				secondMin = i;
			}
		}
		System.out.println("Second Max Value : " + secondMin);
	}
}
