//Write a program to print even numbers in the array
package day4_May;

public class ArrayEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {11, 12, 13,14,15, 16, 17,18,19,20};
		for (int i=0; i<(a.length); i++)
		{
			if ((a[i]%2)==0)
			{
				System.out.println(a[i]);
			}

		}


	}

}
