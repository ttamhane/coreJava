package Day3_5May;

public class PatternPrint9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int x=rows;
		
		for (int i=rows; i>=1; i--) {
			for (int j=1; j<=((2*i)-1); j++)
			{
				System.out.print("*");
			}
			System.out.println();
			x--;
			 for (int k=rows; k>=(x+1); k--)
				{
					System.out.print(" ");
				}
		}
		
	}

}
