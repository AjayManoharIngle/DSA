package hashing;

public class CountOfChar_2 {

	public static void main(String[] args) {
		
		String str ="abababac";
		
		// count how much 1 appear in array
		normalMethod(str,'a');
		normalMethod(str,'b');
		normalMethod(str,'c');
		// This method will take lot of time if i have count of all numbers 
		// We have Q number and each will execute function of count O(n) => Q * O(n) 
		
		// To reduce such problem we have hashing
		hashMethod(str);
		hashMethod1(str);
	}
	
	// we take 256 length as str has all chr
		private static void hashMethod1(String str) {
			// will create hash of mentioned size or max number in array
			int hash[] = new int[256];
			for(int i=0;i<str.length();i++) {
				hash[str.charAt(i)-'a']++;
			}
			System.out.println(hash['a'-'a'] + " " + hash['b'-'a'] + " " + hash['c'-'a']);
		}

	// we take 26 length as str only as lower charcter only
	private static void hashMethod(String str) {
		// will create hash of mentioned size or max number in array
		int hash[] = new int[26];
		for(int i=0;i<str.length();i++) {
			hash[str.charAt(i)-'a']++;
		}
		System.out.println(hash['a'-'a'] + " " + hash['b'-'a'] + " " + hash['c'-'a']);
	}

	private static void normalMethod(String str, char ch) {
		int c = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ch)
				c++;
		}
		System.out.println("Count of " + ch + " is " + c);
	}

}
