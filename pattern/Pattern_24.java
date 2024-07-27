package pattern;

public class Pattern_24 {

	public static void main(String[] args) {
		// Pascal's triangle
		
		//          1
		//       1     1
		//     1    2     1
		//  1    3     3     1
		//1    4    6     4     1
		
		int n = 5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(" ");
			}
			int c = 1;
			for(int j=1;j<=i;j++) {
				System.out.print(c + " ");
				c = c*(i-j)/j;
			}
			System.out.println("");
		}
		
	}

}