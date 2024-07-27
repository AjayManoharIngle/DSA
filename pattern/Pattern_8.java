package pattern;

public class Pattern_8 {

	public static void main(String[] args) {
		
		// * * * * * * * * *
		//   * * * * * * *
		//     * * * * *
		//       * * *
		//         *
		
// observe -> [space, star, space]
//	      [0,9,0]
//	      [1,7,1]
//	      [2,5,2]
//	      [3,3,3]
//	      [4,1,4]
//-------------------------------------
//      [i, (2*(n-i)-1), (i)]
		
		int n = 5;
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
