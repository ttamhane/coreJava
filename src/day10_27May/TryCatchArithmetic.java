//Handled arithemetic exception
package day10_27May;

public class TryCatchArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10, b=0;
			int c=a/b;
			System.out.println(c);
			int arr[] = {10,20,30};
			System.out.println(arr[10]); // java.lang.ArrayIndexOutOfBoundsException will be thrown
			System.out.println("End of Code");
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Please check second number cannot be zero");
		}
		System.out.println("End of try catch block");

	}

}
