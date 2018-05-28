package day9_26May;

public class PaperBook extends Book{

	static int couriercost=150;
	int finalcost;

	@Override
	void price() {
		// TODO Auto-generated method stub
		finalcost=(cost+couriercost);
		System.out.println(finalcost);
	}
}
