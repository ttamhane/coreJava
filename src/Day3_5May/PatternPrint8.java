package Day3_5May;

public class PatternPrint8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int x=rows;
		
		for (int i=1; i<=rows; i++)
		{
			for (int k=1; k<=(x-1); k++)
			{
				System.out.print(" ");
			}
			x--;
			for (int j=1; j<=((2*i)-1); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}


}
