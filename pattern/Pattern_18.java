package pattern;

public class Pattern_18 {

	public static void main(String[] args) {
		
//		    A
//		   ABA
//		  ABCBA
//		 ABCDCBA
		
//		[space,chars,space]
//		0[3,1,3]
//		1[2,3,2]
//		2[1,5,1]
//		3[0,7,0]
// --------------------
		
//      [(n-i-1),(2*i+1),(n-i-1)]
// if row no is 5 then print ABCBA means till 3 - ABC print and after that BA
		int n = 4;
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n-i-1;j++) {
				System.out.print(" ");
			}
			char ch = 'A';
			int breakPoint = (2*i+1)/2 ;
			for(int j=1;j<=2*i+1;j++) {
				System.out.print(ch);
				if(j <=breakPoint){
					ch++;
				}else {
					ch--;
				}
			}
			for(int j=1;j<=n-i-1;j++) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
	}

}
