package twopointer_slidingwindow;

public class LongestSubstringWithRepeatingReplacementChar_9 {

	public static void main(String[] args) {
		//  You can choose any character of the string and change it to any other uppercase English character.
		// You can perform this operation at most k times.
		// length of the longest substring containing the 
		// same letter you can get after performing the above operations.
		
		String str = "AABABBA";
		int k =2;
		
		// T.C  = O(n^2) and S.C = O(1)
		bruteForce(str,k);
		
		// T.C = O(2n)*26 and S.C = O(1);
		betterSol(str,k);
		
		// T.C = O(n) and S.C = O(1);
		optimalSol(str,k);
	}

	private static void optimalSol(String str, int k) {
		int l=0;
		int r=0;
		int maxLen = Integer.MIN_VALUE;
		int maxOfCharChange = Integer.MIN_VALUE;
		int hash[] = new int[26];
		
		while(r < str.length()) {
			hash[str.charAt(r)-'A']++;
			maxOfCharChange = Math.max(hash[str.charAt(r)-'A'], maxOfCharChange);
			
			// it will update it's window with hash sizes like [ len - maxOfCharj <= k ]  if not valid
			if((r-l+1) - maxOfCharChange > k) {
				hash[str.charAt(l)-'A']--;
				maxOfCharChange=0;
				
				// it will always decrease value of maxOfCharChange so it will not benifit me so avaoid it
//				for(int i=0;i<hash.length;i++) {
//					maxOfCharChange = Math.max(maxOfCharChange,hash[i]);
//				}
				l++;
			}
			
			if((r-l+1) - maxOfCharChange <= k) {
				maxLen = Math.max(maxLen, r-l+1);
			}
			r++;
		}
		System.out.println("MaxLen : " + maxLen);
	}

	private static void betterSol(String str, int k) {
		int l=0;
		int r=0;
		int maxLen = Integer.MIN_VALUE;
		int maxOfCharChange = Integer.MIN_VALUE;
		int hash[] = new int[26];
		
		while(r < str.length()) {
			hash[str.charAt(r)-'A']++;
			maxOfCharChange = Math.max(hash[str.charAt(r)-'A'], maxOfCharChange);
			
			// it will update it's window with hash sizes like [ len - maxOfCharj <= k ]  if not valid
			while((r-l+1) - maxOfCharChange > k) {
				hash[str.charAt(l)-'A']--;
				maxOfCharChange=0;
				for(int i=0;i<hash.length;i++) {
					maxOfCharChange = Math.max(maxOfCharChange,hash[i]);
				}
				l++;
			}
			
			if((r-l+1) - maxOfCharChange <= k) {
				maxLen = Math.max(maxLen, r-l+1);
			}
			r++;
		}
		System.out.println("MaxLen : " + maxLen);
	}

	private static void bruteForce(String str, int k) {
		int maxLen = Integer.MIN_VALUE;
		for(int i=0;i<str.length();i++) {
			int hash[] = new int[26];
			int maxOfCharChange = Integer.MIN_VALUE;
			for(int j=i;j<str.length();j++) {
				hash[str.charAt(j)-'A']++;
				// get max no of char and substract this from length of substring so that
				// you get length of chracters needs to chnages
				maxOfCharChange = Math.max(maxOfCharChange,	hash[str.charAt(j)-'A']);
				
				// from this you will min char need to changed
				// let say A=3, B=2, C=1 then you will have replace B and C not A 
				int chnages = (j-i+1) - maxOfCharChange;
				if(chnages <= k) {
					maxLen = Math.max(maxLen, j-i+1);
				}
			}
		}
		System.out.println("MxLen : " + maxLen);
	}

}
