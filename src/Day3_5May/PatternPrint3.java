package Day3_5May;

public class PatternPrint3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 4;
		for (int i=1; i<=rows; i++)
		{
			char ch = 'A';
			for (int j=1; j<=i; j++)
			{
				System.out.print(ch);
				ch++;
			}

			System.out.println();
		}
	}

}
