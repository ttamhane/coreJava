package day4_May;

public class SecondLargestOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10, 20, 30, 5, 100, 6, 2,99};
		int max = a[0], smax =a[0];

		for (int i=0; i<a.length; i++) 
		{
			if (a[i] > smax)
			{
				if (a[i]>max)
					max =a[i];	
			}
			
		}

		System.out.println("Largest number is " + max);
		System.out.println("Second largest number is " + smax);



	}

}
