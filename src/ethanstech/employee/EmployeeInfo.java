package ethanstech.employee;
import ethanstech.utility.Date;
public class EmployeeInfo {
	int id, salary,age;
	String name;
	Date dob;
	EmployeeInfo(int id, int salary, int age, String name, Date dob)
	{
		this.id=id;
		this.salary=salary;
		this.age=age;
		this.name=name;
		this.dob=dob;
	}
	void showData()
	{
		System.out.println(id);
		System.out.println(salary);
		System.out.println(age);
		System.out.println(name);
		System.out.println(dob.dd +"/" + dob.mm +"/" + dob.yy);
	}
}

