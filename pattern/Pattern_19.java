package pattern;

public class Pattern_19 {

	public static void main(String[] args) {
		
		// E
		// D E
		// C D E
		// B C D E
		// A B C D E
		
		int n=9;
		int lastChar = 'A'+n-1;
		for(int i=0;i<n;i++) {
			for(int j=lastChar-i;j<=lastChar;j++) {
				System.out.print((char)j + " ");
			}
			System.out.println(" ");
		}
	}

}
