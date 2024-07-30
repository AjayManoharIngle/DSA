package Recursion;

public class PrintName5times_1 {

	public static void main(String[] args) {
		
		String name = "Ajay";
		int n = 5;
		printName(name,0,n);
	}

	// T.C = O(n) and S.C = O(n)
	private static void printName(String name, int i, int n) {
		if(i >= n)
			return;
		printName(name,i+1,n);
		System.out.println(name);
	}

}
