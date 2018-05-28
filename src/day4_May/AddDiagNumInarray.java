//Write a program to add the diagonal numbers of array.
package day4_May;

public class AddDiagNumInarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{11,22,34}, {1,2,3}, {8,9,10}};
		int sum =0;
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a.length; j++)
			{
				if (i==j)
				{
					sum=sum+ a[i][j];
				}
			}

		}
		System.out.println("sum of numbers is " +sum);
	}

}
