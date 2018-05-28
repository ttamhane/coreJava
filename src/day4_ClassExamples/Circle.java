package day4_ClassExamples;

public class Circle {
	double area;
	void calArea (double r)
	{
		System.out.println("Radius entered is "+ r);
		area = 2*3.14*r;

	}
	void showArea ()
	{
		System.out.println("Area of Circle is "+ area);
	}


}
