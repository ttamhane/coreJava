//Create a person class and accept basic details. this will be a parent class for employee class
package day7_19May;

public class Person {
	String name, city;
	int age;
	void acceptData(String name, int age, String city)
	{
		this.name = name;
		this.age = age;
		this.city=city;
	}

}
