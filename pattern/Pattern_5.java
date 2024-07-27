package pattern;

public class Pattern_5 {

	public static void main(String[] args) {
		
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
		
//		i j 
//		0 5
//		1 4
//		2 3
//		3 2
//		2 1
//		1 0
		
		// method 1
		int n = 5;
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println("++++++++++++++++++++++++++");
		
		// method 2
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
