//Create emp class as child of abstract person class and override the display method
//take some details and print it.
package day8_20May;

public class Emp extends Person{
	int id, sal;
	String name;
	Emp(int id, int sal, String name)
	{
		this.id=id;
		this.sal=sal;
		this.name=name;
	}
	void display() //Override the abstract method from abstract class
	{
		System.out.println(" Id : "+ id);
		System.out.println(" Name : "+ name);
		System.out.println("Salary  : "+ sal);
	}

}
