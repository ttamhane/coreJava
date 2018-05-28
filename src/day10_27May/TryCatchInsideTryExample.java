package day10_27May;
//Example to show try catch inside try block
//this is useful in handling multiple exceptions

public class TryCatchInsideTryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			try
			{
				int x=10, y=0; // If b=0, arithmetic exception will be executed
				int z=x/y;
				System.out.println(z);
				System.out.println("In try 2");
		}
			catch (ArithmeticException g)
			{
				System.out.println("In nested catch :" +g);
			}
			int a=20, b=0; // If b=0, arithmetic exception will be executed
			int c=a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e)
		{
			System.out.println("In catch :" +e);

		}
	}
}
