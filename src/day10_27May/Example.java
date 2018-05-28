package day10_27May;
//Exceptions that are not handled 
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			//int a=10, b=0; When divide by 0 then error will be thrown "java.lang.ArithmeticException:"
			int a=10, b=10;
			int c=a/b;
			System.out.println(c);
			int arr[] = {10,20,30};
			System.out.println(arr[10]); // java.lang.ArrayIndexOutOfBoundsException will be thrown
			System.out.println("End of Code");
		}































	}

}
