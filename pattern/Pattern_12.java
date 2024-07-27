package pattern;

public class Pattern_12 {

	public static void main(String[] args) {
		
//		1             1
//		1 2         2 1
//		1 2 3     3 2 1
//		1 2 3 4 4 3 2 1 
		
//		[number, space, number]
//		[1,6,1]
//		[2,4,2]
//		[3,2,3]
//		[4,0,4]
//		-----------------
//		[i, 2(n-i), i]
		
		int n =9;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=1;k<=2*(n-i);k++) {
				System.out.print(" ");
			}
			for(int p=i;p>=1;p--) {
				System.out.print(p);
			}
			System.out.println(" ");
		}
	}

}
