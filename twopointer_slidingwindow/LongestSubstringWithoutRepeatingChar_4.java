package twopointer_slidingwindow;

public class LongestSubstringWithoutRepeatingChar_4 {

	public static void main(String[] args) {
		
		// Print or find longest sub string without repeating charcaters
		// | distinct charcter
		
		String str = "cadbzabcd";
		int size = str.length();
		
		// T.C = O(n^2) and S.C = O(256)
		findLongestStrWithoutRepChar(size,str);
		
		// T.C = O(n) and S.C = O(256)
		optimizedSolution(size,str);
		// OP - Longest substring len : 5
	}

	private static void optimizedSolution(int size, String str) {
		int hash[] = new int[256];
		for(int i=0;i<hash.length;i++) {
			hash[i] = -1;
		}
		
		int l = 0;
		int r = 0;
		int maxLen = Integer.MIN_VALUE;
		
		while(r < size) {
			int k = hash[str.charAt(r)];
			if(k != -1) {
				if(k >= l) {
					 l = k+1;
				}
			}
			maxLen  = Math.max(maxLen,r-l+1);
			hash[str.charAt(r)] = r;
			r++;
		}
		
		System.out.println("Longest sub string : " + maxLen);
	}

	private static void findLongestStrWithoutRepChar(int size, String str) {
		int maxLen = Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			boolean hash[] = new boolean[256];
			for(int j=i;j<size;j++) {
				// if char is already present then break go to next
				if(hash[str.charAt(j)]==true) break;
				maxLen = Math.max(maxLen, j-i+1);
				hash[str.charAt(j)] = true;
			}
		}
		System.out.println("Longest substring len : " + maxLen);
	}

}
