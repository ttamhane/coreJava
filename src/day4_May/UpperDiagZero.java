//Write a program to make upper diagonal of 2D array as 0.
package day4_May;

public class UpperDiagZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{11,23,24},{1,2,3},{10,20,30}};
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a.length; j++)
			{
				if (i<j)
				{
					a[i][j]=0;
				}
				System.out.print(a[i][j]);
				System.out.print('\t');
			}
			System.out.println();
		}



	}

}
