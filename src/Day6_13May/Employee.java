//Create an employee class- it should have constructor and also accept data function. 
//then display the values . Also show how many objects are created.
package Day6_13May;

public class Employee {
	int id, age, sal;
	String name;
	static int x=0;
	static String cname = "Ethans Tech";
	Employee(int id, String name, int age, int sal)// parameterized constructor
	{
		this.id=id;
		this.name =name;
		this.age =age;
		this.sal=sal;
		x++;
	}
	Employee () //constructor overloading - no parameters
	{
		x++;
	}
	void acceptData(int id, String name, int age, int sal)
	{
		this.id=id;
		this.name =name;
		this.age =age;
		this.sal=sal;
	}
	void show()
	{
		System.out.println("Id "+id);
		System.out.println("Name "+ name);
		System.out.println("Age "+age);
		System.out.println("Salary "+sal);
		System.out.println("Company Name "+cname);
	}


}
