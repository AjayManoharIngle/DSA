package array;

public class CheckArrIsSorted_4 {

	public static void main(String[] args) {
		// yes/no if array is sorted..
		// T.C  = O(n) and S.C = O(1)
		int arr[] = {1,2,3,4,4};
		
		boolean status = false;
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1] > arr[i]) {
				status = false;
				break;
			}
			status = true;
		}
		System.out.println("Sort Arr : " + status);
	}

}
