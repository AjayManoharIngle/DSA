package pattern;

public class Pattern_11 {

	public static void main(String[] args) {
		
//		1
//		0 1
//		1 0 1
//		0 1 0 1
//		1 0 1 0 1
		
		int n = 8;
		// Method 1
		boolean isOneEnable = false;
		boolean isZeroEnable = false;
		for(int i=0;i<n;i++) {
			if(i%2==0) 
				isOneEnable = true;
			else
				isZeroEnable = true;
			
			for(int j=0;j<=i && isOneEnable;j++) {
				if(j%2==0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			
			for(int j=0;j<=i && isZeroEnable;j++) {
				if(j%2==0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			}
			
			System.out.println(" ");
			isOneEnable = false;
			isZeroEnable = false;
		}
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		// Method 2
		int start = 1;
		for(int i=0;i<n;i++) {
			if(i%2 == 0) start =1; else start=0;
			for(int j=0;j<=i;j++) {
				System.out.print(start+ " ");
				start = 1-start;
			}
			System.out.println(" ");
		}
		
	}

}
