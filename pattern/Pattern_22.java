package pattern;

public class Pattern_22 {

	public static void main(String[] args) {
		
		// * * * *
		// *     *
		// *     *
		// * * * *
		
		// if n is even only
		// [2,0][0,2]
		// [1,1][1,1]
		// [1,1][1,1]
		// [2,0][0,2]
		
		int n = 7;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=1;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=n-2 ;j++) {
				if(i==1 || i==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			for(int j=1;j<=1;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		System.out.println("++++++++++++++++++++++++++++++++");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==0 || j==n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}
}
