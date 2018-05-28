//Create a class that is child class of Person and accepts id and Salary
package day7_19May;

public class Employee extends Person
{
	int id, basic_sal;
	void acceptDetails(int id, int basic_sal)
	{
		this.id=id;
		this.basic_sal=basic_sal;
	}
	void show()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("City: "+city);
		System.out.println("Id: "+id);
		System.out.println("Salary: "+basic_sal);
	}
}

