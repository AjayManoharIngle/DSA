package pattern;

public class Pattern_21 {

	public static void main(String[] args) {
		
		// * 				 *
		// * *             * *
		// * * *         * * *
		// * * * *     * * * *
		// * * * * * * * * * *
		// * * * *     * * * *
		// * * *	     * * *
		// * *			   * *
		// *				 *
		
		// [1,8,1]
		// [2,6,2]
		// [3,4,3]
		// [4,2,4]
		// [5,0,5]
		// [4,2,4]
		// [3,4,3]
		// [2,6,2]
		// [1,8,1]
		
		
		int n =10;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=2*i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		int space = 2*n-2;
		for(int i=1;i<=2*n-1;i++) {
			int star = i;
			if(i > n) star = 2*n-i;
			
			for(int j=1;j<=star;j++) {
				System.out.print("@ ");
			}
			
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=star;j++) {
				System.out.print("@ ");
			}
			System.out.println(" ");
			if(i < n) {
				space -= 2;
			}else {
				space += 2;
			}
		}
	}

}
