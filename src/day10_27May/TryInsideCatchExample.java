package day10_27May;
//Example to show try-catch inside catch block.

public class TryInsideCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10, b=0; // If b=0, arithmetic exception will be executed
			int c=a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e)
		{
			System.out.println("In catch" +e);
			try
			{
				int x=10, y=0; // If b=0, arithmetic exception will be executed
				int z=x/y;
				System.out.println(z);
				System.out.println("In try 2" +e);
				System.out.println("Please check second number cannot be zero");
			}
			catch (ArithmeticException g)
			{
				System.out.println("In nested catch" +g);
			}

		}
	}

}
