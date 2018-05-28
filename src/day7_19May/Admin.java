//create admin class that further extends employee (admin -> employee -> person). 
//Set allowances and calculate total salary, also print these 2.
package day7_19May;

public class Admin extends Employee{
	int allowance, totalsal;
	void setAllowance(int allowance) {
		this.allowance=allowance;

	}
	void calTotalSal()
	{
		totalsal=basic_sal+allowance;
	}


	void display()
	{
		System.out.println("Allowances : "+allowance);
		System.out.println("Total Salary : "+totalsal);
	}
}
