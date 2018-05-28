package day4_ClassExamples;

public class Triangle {
	int height, base, per, side1, side2;
	double area;
	void triangle (int h, int b, int s1, int s2)
	{
		area = (h*b)/2;
		per = b+s1+s2;
		
	}
	void show()
	{
		System.out.println("area of triangle is "+ area);
		System.out.println("perimeter of triange is "+ per);
	}



}
