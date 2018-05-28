//Write a program to make the lower diagonal numbers as 0 and print matrix
package day4_May;

public class LowerDiagZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{11,22,34}, {1,2,3}, {8,9,10}};
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a.length; j++)
			{
				if (i>j)
				{
					a[i][j]=0;
				}

			}

		}
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a.length; j++)
			{
				System.out.print(a[i][j]);
				System.out.print('\t');
			}
			System.out.println();

		}
	}
}

