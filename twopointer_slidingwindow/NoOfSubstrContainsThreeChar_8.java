package twopointer_slidingwindow;

public class NoOfSubstrContainsThreeChar_8 {

	public static void main(String[] args) {
		
		// number of sub string containing all three charcater
		
		String str = "abcabc";
		
		// T.C = O(N^2) and S.C=O(1)
		bruteForce2(str);
		
		betterSol(str);
	}

	
	// T.C = O(n), S.C = O(1)
	// we will check min consec three chracters like abc or cba or bca anything 
	// then move from right to left to check min value index of charater 
	// it means at last left we can create sub string so take min value of char + 1
	private static void betterSol(String str) {
		int lastSeen[] = {-1,-1,-1};
		int count = 0;
		for(int i=0;i<str.length();i++) {
			lastSeen[str.charAt(i)-'a'] = i;
			if(lastSeen[0] != -1 && lastSeen[1]!=-1 && lastSeen[2]!=-1) {
				count = count + (1 + 
				(Math.min(lastSeen[0],Math.min(lastSeen[1], lastSeen[2]))));
			}
		}
		System.out.println("No of sub string : " + count);
	}
	
	private static void bruteForce2(String str) {
		int noOfStr = 0;
		for(int i=0;i<str.length();i++) {
			int hash[] = new int[3];
			for(int j=i;j<str.length();j++) {
				hash[str.charAt(j)-'a'] = 1;
				if(hash[0]+hash[1]+hash[2]==3) {
					noOfStr += (str.length()-j);
					break;
				}
			}
		}
		System.out.println(noOfStr);
	}

}
