package day7_19May;

public class Student {
	int id, age, marks;
	String name;
	Student (int id, int age, int marks, String name)
	{
		this.id=id;
		this.age=age;
		this.marks=marks;
		this.name=name;
	}
	public String toString()
	{
		return (id +" " + name +" "  + age + " "  + marks);
	}
	
	
}


