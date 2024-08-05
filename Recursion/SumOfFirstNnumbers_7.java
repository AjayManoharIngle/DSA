package Recursion;

public class SumOfFirstNnumbers_7 {

	public static void main(String[] args) {
		
		int n =5;
		
		System.out.println(sumOfFirstN(n));
		sumOfFirstN1(0,n);
	}

	// functional recursion
	private static int sumOfFirstN(int n) {
		if(n == 0 || n<0)
			return 0;
		return n + sumOfFirstN(n-1);
	}
	
	// parameterized functions
	// (5,0) => 
	private static void sumOfFirstN1(int n, int i) {
		if(i < 1) {
			System.out.println("Sum : " + n);
			return;
		}
		sumOfFirstN1(n+i,i-1);
	}

}
