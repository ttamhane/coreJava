package day8_20May;

abstract public class EmployeeAbs {

	int id, age, basicsal;
	String name;

	void acceptData(int id, String name, int age, int basicsal)
	{
		this.id=id;
		this.age=age;
		this.basicsal=basicsal;
		this.name=name;
	}
	void show()
	{
		System.out.println("ID  : "+id);
		System.out.println("Name  : "+name);
		System.out.println("Age  : "+age);
		System.out.println("Basic Salary  : "+basicsal);
	}
	abstract void calsal();

}
