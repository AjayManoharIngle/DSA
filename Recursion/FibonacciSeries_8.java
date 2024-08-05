package Recursion;

public class FibonacciSeries_8 {

	public static void main(String[] args) {
		
		int n = 5;
		System.out.println("Fibo of " + n + " is " + fiboSeries(n));
	}

	// T.C = O(2^n)
	private static int fiboSeries(int n) {
		if(n <=1 ) {
			return 1;
		}
		return fiboSeries(n-1)+fiboSeries(n-2);
	}
}
