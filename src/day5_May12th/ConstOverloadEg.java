//write a program to demonstrate constructor overloading.
package day5_May12th;

public class ConstOverloadEg 
{
	int rectarea, sqrarea;
	ConstOverloadEg (int x, int y)
	{
		rectarea =x*y;
		System.out.println("Area of rectangle is "+rectarea);
	}
	ConstOverloadEg (int x)
	{
		sqrarea=x*x;
		System.out.println("Area of square is "+sqrarea);

	}

	public static void main(String[] args) 
	{
		ConstOverloadEg c1= new ConstOverloadEg(10,20);
		ConstOverloadEg c2= new ConstOverloadEg(50);

	}
}

