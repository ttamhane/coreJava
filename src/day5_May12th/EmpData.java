//Write a program to accept the data of employees and show details.
package day5_May12th;

public class EmpData
{
int id, age, sal;	
String name;

	void getData(int i, String n, int a, int s)
	{
		id=i;
		name =n;
		age=a;
		sal=s;
	}
	
	void show()
	{
		System.out.println("Id "+id);
		System.out.println("Name "+ name);
		System.out.println("Age "+age);
		System.out.println("Salary "+sal);
	}
	

}
