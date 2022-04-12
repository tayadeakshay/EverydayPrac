
public class PPattern {

	public static void main(String[] args) {

		int n = 9;

		for (int i = 1; i < n; i++) {
			for (int k = n; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if(j==1 || j==i)
				System.out.print(" "+1);
				else if(j==2 || j==i-1)
					System.out.print(" "+(i-1));
				else if(i==5 && (j==3 || j==i-2))
					System.out.print(" "+(i+1));
				else if(i==6 && (j==4 || j==i-3))
					System.out.print(" "+ 10);
				else if(i==7 && (j==5 || j==i-4))
					System.out.print(" "+ 15);
				else if(i==8 && (j==6 || j==i-5))
					System.out.print(" "+ 21);
				else if(i==7 && j==4)
					System.out.print(" "+ 20);
				else if(i==8 && (j==4 || j==i-3))
					System.out.print(" "+ 35);				
//				else
//					System.out.print(" "+ j);
//			
			}
			System.out.println();
		}
	}

}
