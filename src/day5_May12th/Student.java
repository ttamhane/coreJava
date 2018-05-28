package day5_May12th;

public class Student {
	int id, age;
	float per;
	String name;
	Student (int i, String n, int a, float p)
	{
		id=i;
		name=n;
		age=a;
		per =p;
		
	}
	
	void show()
	{
		System.out.println("Student details:");
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Percentage: "+ per);
		if (per<0.0 || per >100.0)
			System.out.println("Error in value of percentage");
	}
	

}
