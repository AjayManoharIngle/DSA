package pattern;

public class Pattern_7 {

	public static void main(String[] args) {
				
//					*
//				  * * *
//			 	* * * * * 
//			  * * * * * * *
//			* * * * * * * * * 
		
// observe -> [space, star, space]
//		      [4,1,4]
//		      [3,3,3]
//		      [2,5,2]
//		      [1,7,1]
//		      [0,9,0]
// -------------------------------------
//            [(n-i-1), (2*i+1), (n-i+1)]
		
		
		int n = 5;
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
	}

}
