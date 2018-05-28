package day8_20May;

public class HR extends Employee{
	int incentives, totalsal;

	void setIncentive(int incentives)
	{
		this.incentives = incentives;
	}

	void calsal()
	{
		totalsal=basicsal+incentives;
	}
	void display()
	{
		show();
		System.out.println("Incentives  : "+incentives);	
		System.out.println("Total Salary  : "+totalsal);
	}


}
