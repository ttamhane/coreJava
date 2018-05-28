//Create parent class to accept fname, nname, lname, qual and age of a parent
package day7_19May;

public class Parent {
	String fname, mname, lname, qual;
	int age;
	void accept(String fname, String mname, String lname, String qual, int age)
	{
		this.fname=fname;
		this.mname=mname;
		this.lname=lname;
		this.qual=qual;
		this.age=age;
		
	}

}
