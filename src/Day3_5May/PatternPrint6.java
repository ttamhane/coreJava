package Day3_5May;

public class PatternPrint6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1, rows =4;
		for (int i=1; i<=rows; i++)
		{
			for (int j=rows; j>=i; j--)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}

	}

}
