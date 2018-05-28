//Find smallest number of array.
package day4_May;

public class SmallestNunOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30, 1,3,99};
		int min = a[0];
		for (int i=0; i<a.length; i++)
		{
			if (a[i]<min)
{
	min=a[i];
}
		}
		System.out.println("Smallest numver is "+min);

	}

}
