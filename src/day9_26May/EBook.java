package day9_26May;

public class EBook extends Book{
	static int discountper=10;
	int finalcost;

	@Override
	void price() {
		// TODO Auto-generated method stub
		finalcost=(cost-(cost*discountper/100));
		System.out.println(finalcost);
	}


}
