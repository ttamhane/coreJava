package day10_27May;
//Example for throw keyword- built-in exception is used, but try catch block is also included 

public class ThrowBuiltInWithTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int age =10;
			if (age <18)
			{
				throw new ArithmeticException();
			}
			else
			{
				System.out.println("User is eligible");
			}
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception is : "+e);
			System.out.println("Please enter a valid age >18");
		}
	}

}
