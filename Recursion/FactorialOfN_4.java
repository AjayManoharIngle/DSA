package Recursion;

public class FactorialOfN_4 {

	public static void main(String[] args) {
		
		int n = 11;
		System.out.println(printFactorialOfN(n));
		
		printFact(1,n);
	}

	private static void printFact(int n, int i) {
		if(i<1) {
			System.out.println("Factoral is : " + n);
			return;
		}
		printFact(n*i,i-1);
	}

	private static int printFactorialOfN(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*printFactorialOfN(n-1);
	}

}
