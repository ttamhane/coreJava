package day8_20May;

public class TestShape {
	Shape createShape()
	{
		int ch =2;
		if (ch==1)
		{
			Circle c= new Circle();
			return c;
		}
		else if (ch==2)
		{
			Square sq= new Square();
			return sq;
		}
		else if (ch==3)
		{
			Rectangle r= new Rectangle();
			return r;
		}
		else
		{
			Shape sh= new Shape();
			return sh;
		}

	}
	
}
