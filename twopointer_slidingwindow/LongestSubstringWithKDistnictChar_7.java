package twopointer_slidingwindow;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithKDistnictChar_7 {

	public static void main(String[] args) {
		
		// longest substring with k distict charcter
		// [bbcccccc]
		
		String str = "aaabbccccccd";
		int k=2;
		
		// T.C = O(n^2) and S.C = O(256)
		bruteForce(str,k);
		
		// T.C = O(2n) and S.C = O(1)
		betterForce(str,k);
		
		// T.C = O(n) and S.C = O(1)
		optimalSol(str,k);
	}

	private static void optimalSol(String str, int k) {
		int l = 0;
		int r = 0;
		int maxLen = Integer.MIN_VALUE;
		HashMap<Character,Integer> map = new HashMap<>();
		while(r < str.length()) {
			map.put(str.charAt(r),map.getOrDefault(str.charAt(r),0)+1);
			if(map.size() > k) {
				map.put(str.charAt(l),map.get(str.charAt(l))-1);
				if(map.get(str.charAt(l))==0) {
					map.remove(str.charAt(l));
				}
				l++;
			}
			if(map.size() <= k) {
				maxLen = Math.max(maxLen,r-l+1);
			}
			r++;
		}
		System.out.println("Maxlen : " + maxLen);
	}

	private static void betterForce(String str, int k) {
		int l = 0;
		int r = 0;
		int maxLen = Integer.MIN_VALUE;
		HashMap<Character,Integer> map = new HashMap<>();
		while(r < str.length()) {
			map.put(str.charAt(r),map.getOrDefault(str.charAt(r),0)+1);
			while(map.size() > k) {
				map.put(str.charAt(l),map.get(str.charAt(l))-1);
				if(map.get(str.charAt(l))==0) {
					map.remove(str.charAt(l));
				}
				l++;
			}
			if(map.size() <= k) {
				maxLen = Math.max(maxLen,r-l+1);
			}
			r++;
		}
		System.out.println("Maxlen : " + maxLen);
	}

	private static void bruteForce(String str, int k) {
		int maxLen = 0;
		for(int i=0;i<str.length();i++) {
			HashSet<Character> set =  new HashSet<>();
			for(int j=i;j<str.length();j++) {
				set.add(str.charAt(j));
				if(set.size() <= k) {
					maxLen = Math.max(maxLen, j-i+1);
				}else {
					break;
				}
			}
		}
		System.out.println("Maximum len : " + maxLen);
	}

}
