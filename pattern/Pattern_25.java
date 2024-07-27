package pattern;

public class Pattern_25 {

	public static void main(String[] args) {
		
		// Pyramid pattern
		
		//        *
		//     *     *
		//   *    *    *
		// *   *     *    *
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
