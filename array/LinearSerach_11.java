package array;

public class LinearSerach_11 {

	public static void main(String[] args) {
		// find out first occ search ele and retun index
		int arr[] = {2,3,4,5,4,5,6};
		int x= 5;
		
		search(arr,x);
	}

	private static void search(int[] arr,int target) {
		int index = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				index = i;
				break;
			}
		}
		System.out.println("Search of first ele " + target + " is at index : "+index);
	}

}
