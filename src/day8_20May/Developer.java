package day8_20May;

public class Developer extends Employee{
	int costperhour, extrahours;
	int totalsal;
	void setHours(int costperhour, int extrahours)
	{

		this.costperhour= costperhour;
		this.extrahours= extrahours;
	}
	void calsal()
	{
		totalsal=basicsal+(costperhour*extrahours);
	}
	void dispaly()
	{
		show();
		System.out.println("Cost per Hour  : "+costperhour);
		System.out.println("Extra Hours : " + extrahours);
		System.out.println("Total Salary  : "+totalsal);
	}

}
