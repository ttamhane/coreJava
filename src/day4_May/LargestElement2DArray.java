//Write a program to find the largest element of 2 D array.
package day4_May;

public class LargestElement2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{11,22,34}, {1,2,300}, {8,9,10}};
		int max=a[0][0];
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a.length; j++)
			{
				if (a[i][j]>max)
				{
					max=a[i][j];
				}
			}
			
		}
		System.out.println("Largest element of the array is " +max);

		
		
	}

}
