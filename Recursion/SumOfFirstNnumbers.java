package Recursion;

public class SumOfFirstNnumbers {

	public static void main(String[] args) {
		
		int n =5;
		
		System.out.println(sumOfFirstN(n));
	}

	private static int sumOfFirstN(int n) {
		if(n == 0)
			return 0;
		return n + sumOfFirstN(n-1);
	}

}
