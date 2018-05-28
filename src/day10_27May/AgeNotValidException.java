package day10_27May;
//create 2 constructors - default and parameterized to handle the age not valid exception.

public class AgeNotValidException extends Exception{
	AgeNotValidException()
	{
		System.out.println("Age is not valid - default constructor");
	}

	AgeNotValidException(String s)
	{
		System.out.println(s + ":  parameterized constructor");
	}
}
