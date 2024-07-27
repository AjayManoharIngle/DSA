package pattern;

public class Pattern_4 {

	public static void main(String[] args) {
//		
//		1 
//		2 2 
//		3 3 3
//		4 4 4 4
		
		int no = 4;
		for(int i=0;i<no;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((i+1) + " ");
			}
			System.out.println(" ");
		}
	}

}
