//Class to hold 2 methods
package Day6_13May;

public class MethodEg1 {

	void show()
	{
		System.out.println("In show");
	}
	void msg()
	{
		show();
		System.out.println("In msg");
		MethodEg2 m2= new MethodEg2();
		m2.display();
	}
}
