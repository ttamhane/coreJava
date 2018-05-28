package day10_27May;

public class ThrowsBuiltInWithTryCatch {
	void division (int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException
	{
		int c=a/b;
		System.out.println(c);
		/*int x[]= {a,b};
		System.out.println(x[0]);*/
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ThrowsBuiltInWithTryCatch t= new ThrowsBuiltInWithTryCatch();
			t.division(10, 2);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Please check second number cannot be zero");
		}
		finally
		{
			System.out.println("Finally executed");
		}
		System.out.println("End of code");
	}
}
