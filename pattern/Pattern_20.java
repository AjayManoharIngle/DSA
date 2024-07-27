package pattern;

public class Pattern_20 {

	public static void main(String[] args) {
		
		// * * * * * * * * * *
		// * * * *     * * * *
		// * * *         * * *
		// * *             * *
		// *                 *
		// *                 *
		// * *             * *
		// * * *         * * *
		// * * * *     * * * *
		// * * * * * * * * * *
		
		//[star,space,star]
		// [5,0,5]
		// [4,2,4]
		// [3,4,3]
		// [2,6,2]
		// [1,8,1]
		//-------------- symmetry
		// [1,8,1]
		// [2,6,2]
		// [3,4,3]
		// [4,2,4]
		// [5,0,5]
		
		int n = 10;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			for(int k=0;k<2*i-2;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println("");
			
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int k=0;k<2*(n-i);k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
			
		}
	}

}
