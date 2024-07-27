package pattern;

public class Pattern_15 {

	public static void main(String[] args) {
		
//		A
//		A B
//		A B C
//		A B C D
//		A B C D E
		
		// method 1 :
		int n=6;
		for(int i=1;i<=n;i++) {
			int ch = 'A';
			for(int j=0;j<i;j++) {
				System.out.print((char)(ch+j)+ " ");
			}
			System.out.println(" ");
		}
		System.out.println("++++++++++++++++++++++++++++++ ");
		
		
		// method 2 : 
		for(int i=0;i<n;i++) {
			for(char j='A';j<='A'+i;j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}

}
