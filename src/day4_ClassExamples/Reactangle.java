package day4_ClassExamples;

public class Reactangle {

	int l,b,p,a;
	void acceptData (int num1, int num2)
	{
	 System.out.println("values in accept data are "+ num1 + num2); 
	 l=num1;
	 b=num2;	 
	}
	
	void calArea()
	{
		a=l*b;
	}
	void calPerimeter()
	{
		p=2*(l+b);
	}
	
	void show()
	{
		System.out.println("Perimeter of rectangle is" +'\t'+ p);
		System.out.println("Area of rectangle is" + '\t'+a);
	}
	
}
