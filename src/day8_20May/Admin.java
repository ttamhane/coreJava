package day8_20May;

public class Admin extends Employee{
	int allowance, totalsal;
	void setAllowance(int allowance)
	{
		this.allowance = allowance;
	}

	void calsal()
	{
		totalsal=basicsal+allowance;
	}
	void display()
	{
		show();
		System.out.println("Allowance  : "+allowance);	
		System.out.println("Total Salary  : "+totalsal);
	}


}
