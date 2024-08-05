package Recursion;

public class IsStringPalindrome_5 {

	public static void main(String[] args) {
		
		String str = "radar";
		System.out.println(checkPalindromeStr(str,str.length(),0));
	}

	// check at mid i cross mid return and if char is not match start and end then return
	private static boolean checkPalindromeStr(String str, int length, int i) {
		if(i >= length/2) {
			return true;
		}
		if(str.charAt(i) != str.charAt(length-i-1)) {
			return false;
		}
		return checkPalindromeStr(str,length,i+1);
	}
}
