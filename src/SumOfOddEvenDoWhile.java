//Write a program to find sum of odd numbers between 1 to 100 using do while.
public class SumOfOddEvenDoWhile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1, sumeven=0, sumodd=0;
		do
		{
			if ((num % 2)==0)
			{
				sumeven = num+sumeven;
			}
		else 
		{
			sumodd = num+sumodd;

		}
		num++;
	} while (num<=100);
	System.out.println ("sum of even numbers is " +sumeven);
	System.out.println ("sum of odd numbers is " +sumodd);
}

}
