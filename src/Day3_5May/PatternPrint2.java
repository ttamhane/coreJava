package Day3_5May;

public class PatternPrint2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 3;
		for (int i=1; i<=rows; i++)
		{
			for (int j=3; j>=i; j--)
			{
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
