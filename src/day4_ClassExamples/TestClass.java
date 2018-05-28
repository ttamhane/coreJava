package day4_ClassExamples;

public class TestClass {
	int a, b; //Instance or class level variables that can be accessed anywhere in the class, initialized to 0 by default.
	void acceptData(int num1, int num2)
	{
		//num 1 and num 2 are local variables that can be accessed only within this method.
		a=num1;
		b=num2;
		System.out.println("Inside acceptData "+ num1 + num2);
	}
	void show()
	{
		System.out.println("in show " + a + b);
	}

}
