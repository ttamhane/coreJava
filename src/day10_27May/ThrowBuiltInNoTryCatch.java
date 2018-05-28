package day10_27May;
//Example to use Throw keyword- built in exception but without try catch block
//here JVM will handle the exception and program will terminate
public class ThrowBuiltInNoTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =10;
		if (age <18)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("User is eligible");
		}
		System.out.println("Outside if else block , end of code");
	}

}
