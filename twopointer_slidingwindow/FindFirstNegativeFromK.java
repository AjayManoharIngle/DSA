package twopointer_slidingwindow;

import java.util.ArrayList;

public class FindFirstNegativeFromK {

	public static void main(String[] args) {
		
		int arr[] = {12,1,7,8,-15,30,16,18};
		findFirstNegativeK(arr,3);
	}

	private static void findFirstNegativeK(int[] arr, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0,j=k-1;i<arr.length && j <arr.length; i++,j++){
			 boolean status = false;
		      for(int p=i;p<=j;p++){
		         if(arr[p] < 0) {
		        	 list.add(arr[p]);
		        	 status = true;
		        	 break;
		         }
		      }
		      if(!status) {
		    	  list.add(0);
		      }
		}
		System.out.println(list);
	}
}
