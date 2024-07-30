package Recursion;

public class Print1ToN_2 {

	public static void main(String[] args) {
		
		int n=5;
		printNumber1(n,1);
		System.out.println("+++++++++++++++++");
		printNumber2(n);
	}

	// without backtracking..
	private static void printNumber1(int n, int i) {
		if(i>n) 
			return;
		System.out.println(i);
		printNumber1(n,i+1);
	}
	
	// with backtracking..
	private static void printNumber2(int i) {
		if(i<1) 
			return;
		printNumber2(i-1);
		System.out.println(i);
	}

}