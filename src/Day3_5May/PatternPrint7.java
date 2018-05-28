package Day3_5May;

public class PatternPrint7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char ch1='A', ch2='a';
		//int rows =3;
		for (int i=1; i<=3; i++)
		{
			char ch1='A', ch2='a';
			for (int j=1; j<=i; j++)
			{
				System.out.print(ch1);
				System.out.print(ch2);
				ch1++;
				ch2++;
			}

			System.out.println();

		}

	}

}
