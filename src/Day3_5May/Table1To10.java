package Day3_5May;

public class Table1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=10; i++)
		{
			{
				for (int j=1; j<=10; j++)
				{
					int n=i*j;
					System.out.print(n);
					System.out.print('\t');
				}
			}
			System.out.println();
		}

	}

}
