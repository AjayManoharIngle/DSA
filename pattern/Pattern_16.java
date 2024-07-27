package pattern;

public class Pattern_16 {

	public static void main(String[] args) {
		
		// A B C D E 
		// A B C D
		// A B C
		// A B
		// A
		// 5 4 3 2 1
		
		int n=5;
		for(int i=0;i<n;i++) {
			for(char j='A';j<=(n-i+'A'-1);j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}
}
