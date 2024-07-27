package pattern;

public class Pattern_9 {

	public static void main(String[] args) {
		
//			*
//		  * * *
//	 	* * * * * 
//	  * * * * * * *
//	* * * * * * * * * 
//  * * * * * * * * *
//    * * * * * * *
//      * * * * *
//        * * *
//          *
		
		int n=5;
		for(int i=0;i<n;i++) {
			for(int s=0; s<n-i-1;s++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			for(int s=0; s<n-i-1;s++) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		for(int i=0;i<n;i++) {
			for(int s=0; s<i;s++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*(n-i)-1;k++) {
				System.out.print("*");
			}
			for(int s=0; s<i;s++) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
