package Recursion;

public class PrintNto1_3 {

	public static void main(String[] args) {
		
		int n=5;
		printNumber1(n,1);
		System.out.println("++++++++++++++++++++++++++++");
		printNumber2(n);
	}

	private static void printNumber1(int n, int i) {
		if(i>n) 
			return;
		printNumber1(n,i+1);
		System.out.println(i);
	}
	
	private static void printNumber2(int n) {
		if(n<1) 
			return;
		System.out.println(n);
		printNumber2(n-1);
	}

}
