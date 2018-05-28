//Child class with parent as parent class, accept only fname and age qual.
//mname and lname should be taken as of parent.
//write show method to display parent and child details in a given format
package day7_19May;

public class Child extends Parent{
	String fname, qual;
	int age;

	void getData(String fname, String qual, int age)
	{
		this.fname=fname;
		this.qual=qual;
		this.age=age;
	}
	void show()
	{
		System.out.println("First Name" + '\t' + "Middle Name" + '\t'+"Last Name" + '\t'+"Age" + '\t'+"Qualification");
		System.out.println(super.fname +'\t'+ super.mname + '\t'+ super.lname + '\t'+ '\t'+ super.age + '\t'+ super.qual);
		System.out.println(fname + '\t'+ '\t' + super.mname + '\t'+ super.lname +'\t'+ '\t'+ age + '\t'+ qual);

	}

}
