package day5_May12th;

public class CircleRetType {
	int radius;
	float area;
	void takeRadius(int cradius)
	{
		radius = cradius;
	}
	float area()

	{
		area=3.14f*radius*radius;
		return area;

	}

}
