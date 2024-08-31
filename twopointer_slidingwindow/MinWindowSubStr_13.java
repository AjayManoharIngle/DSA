package twopointer_slidingwindow;

import java.util.HashMap;

public class MinWindowSubStr_13 {

	public static void main(String[] args) {
		String str = "ddaaabbca";
		String t = "abbc";
		
		// string t should be present in sub string with same occurrence.
		// abbc => {a=1,b=2,c=1}
		// OP - [aaabbc, aaabbca,aabbc,aabbca,abbc,abbca] => abbc - len = 4
		
		optimalSol(str,t);
	}

	private static void optimalSol(String str, String t) {
		int minLen = Integer.MAX_VALUE;
		int startIndex = -1;
		int l =0;
		int r = 0;
		int c = 0;
		HashMap<Character,Integer> map = new HashMap<>();
		
		// create count of each char map
		for(char i : t.toCharArray()) {
			map.put(i,map.getOrDefault(i,0)+1);
		}
		while(r < str.length()) {
			
			// it will check each char in S be postive then possiblity of substring
			if(map.get(str.charAt(r)) != null){
				if (map.get(str.charAt(r)) > 0) {
					c++;
				}
				
				// make it reduce because char in t is found at least one's so if it 
				// found later also we can skip it.
				map.put(str.charAt(r),map.getOrDefault(str.charAt(r),0)-1);
			}

			// if we get same count as t means all char's found 
			// and then need to get minLen and move forward with other sub array
			// for found new min len of sub array so increase value of left and 
			// Decease count of subarray
			while(c == t.length()) {
				if(r-l+1 < minLen) {
					minLen = r-l+1;
					startIndex = l;
				}
				
				if(map.get(str.charAt(l)) != null){
					map.put(str.charAt(l),map.getOrDefault(str.charAt(l),0)+1);
					if(map.get(str.charAt(l)) > 0) {
						c--;
					}
				}
				l++;
			}
			r++;
		}
		
		if(startIndex == -1) {
			System.out.println("No substring present");
		}else {
			System.out.println(str.substring(startIndex,startIndex+minLen));
		}
	}

}