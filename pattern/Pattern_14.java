package pattern;

public class Pattern_14 {

	public static void main(String[] args) {
		
//		    *
//		  * *
//		* * *
//	  * * * *
//	
//	[space, star]	
//	[3,1] [2,2],[1,3],[0,4] => [n-i, i]
		
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
	}

}
