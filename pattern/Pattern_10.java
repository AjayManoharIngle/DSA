package pattern;

public class Pattern_10 {

	public static void main(String[] args) {
		
//		* 
//		* *
//		* * *
//		* * * *
//		* * * * * 
//		* * * *
//		* * *
//		* *
//		*
		
		// how to get number of rows = 9 if n=5 => 2n-1 = 2*5-1 = 9
		
		int n = 3;
		for(int i=1;i<=(2*n-1);i++) {
			int symm = i;
			if(i > n) {
				symm = 2*n - i;
			}
			for(int j=1;j<=symm;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
