//Write a program to print the count of total odd #s in the array
package day4_May;

public class EvenCountInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {11,12,13,14,15,16, 17,18,19,20};
		int x=0;
		for (int i=0; i<a.length; i++) 
		{
			if (a[i]%2 != 0)
			{
				x++;
				
			}
		}
		System.out.println("Total count of odd numbers is " + x);

	}

}
