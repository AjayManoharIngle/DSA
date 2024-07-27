package pattern;

public class Pattern_17 {

	public static void main(String[] args) {
		
		// A
		// B B
		// C C C
		// D D D D 
		// E E E E E
		
		int n=5;
		for(int i=0;i<n;i++) {
			char ch = (char) ('A'+ i);
			for(int j=0;j<=i;j++) {
				System.out.print(ch + " ");
			}
			System.out.println(" ");
		}
	}

}
