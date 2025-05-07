package binary_search;

public class FindLowerBoundOfX_2 {

	public static void main(String[] args) {
		
		// find lower bound of target ele 
		// ex. arr[element] >= target 
		// means first value meet in array that index is lower bound with
		// stasfied with above condition
		
		int arr[] = {1,2,3,3,4,5,6,89};
		int x = 7;
		
		lowerBoundOfX(arr,x);
	}

	private static void lowerBoundOfX(int[] arr, int x) {
		int low = 0;
		int high = arr.length-1;
		while(low <= high) {
			
			int mid  = low + (high-low)/2;
			
			if(arr[mid] >= x) {
				System.out.println("Lower bound of " + x + " is  : " + mid);
				break;
			}
		}
		
	}
}
