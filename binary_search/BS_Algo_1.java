package binary_search;

public class BS_Algo_1 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,5,6,7,8,19,45};
		int len = arr.length;
		int target = 3;
		
		iterative(arr,len,target);
		int index = recursive(arr,target,0,len-1);
		if(index !=-1)
			System.out.println("Search ele is found at index: " + index);
		else
			System.out.println("no element is found");
	}

	private static int recursive(int[] arr, int target, int low, int high) {
		if(low > high)
			return -1;
		
		int mid = low + (high-low)/2;
		if(arr[mid] == target)
			return mid;
		else if(arr[mid] < target) 
			return recursive(arr, target, mid+1, high);
		else
			return recursive(arr,  target, low, mid-1);
		
	}

	// T.C  = O(logn) and S.C = O(1)
	private static void iterative(int[] arr, int len, int target) {
		int low = 0;
		int high = len-1; 
		int status = -1;
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(arr[mid] == target) {
				System.out.println("Search ele is found at index: " + mid);
				status = 0;
				break;
			}
			else if(arr[mid] < target) {
				low = mid+1;
			}else{
				high = mid-1;
			}
		}
		if(status==-1)
			System.out.println("no element is found");
	}

}
