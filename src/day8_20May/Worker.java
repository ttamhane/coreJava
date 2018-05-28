//Create worker class as child of abstract person class and override the display method
//take some details and print it.
package day8_20May;

public class Worker extends Person {

	int workinghrs;
	String name;
	Worker(int workinghrs, String name)
	{
		this.workinghrs=workinghrs;
		this.name=name;
	}
	void display()
	{
		System.out.println(" Name : "+ name);
		System.out.println(" workinghrs : "+ workinghrs);

	}

}
