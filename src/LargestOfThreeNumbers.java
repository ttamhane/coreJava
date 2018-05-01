//Write a program to find largest of 3 numbers.
public class LargestOfThreeNumbers 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=2000, b=1150, c=1300;
		if (a>b) 
		{
			if (a>c)
			{
				System.out.println(a+ " is largest of three numbers");
			}
			else
			{
				System.out.println(c+ " is largest of three numbers");
			}
		}
		else
		{
			if (b>c)
			{
				System.out.println(b+ " is largest of three numbers");
			}
			else 
			{
				System.out.println(c+ " is largest of three numbers");
			}

		}
	}
}
