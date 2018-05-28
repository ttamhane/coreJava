package day10_27May;
//example to show multiple catch blocks handling common exceptions
//included generic exception in the end.

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10, b=10; // If b=0, arithmetic exception will be executed
			int c=a/b;
			System.out.println(c);
			int arr[] = {10,20,30};
			System.out.println(arr[0]); // java.lang.ArrayIndexOutOfBoundsException will be thrown
			System.out.println("End of Code");
			String s=null;
			s.length(); //null pointer exception will be handled in catch (exception e)
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Please check second number cannot be zero");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("Please check the array index");
		}
		catch (Exception e) // give this in last as the catch is checked one by one.
		{
			System.out.println(e);
		}

	}

}
