package day8_20May;

public class Results extends Marks implements SportsMarks {
	int sm, totalmarks;
	@Override
	public void getsportsmarks(int sm) {
		// TODO Auto-generated method stub
		this.sm=sm;
	}
	void caltotal()
	{
		totalmarks=m1+m2+m3+sm;
		System.out.println("Total Marks : " +totalmarks);
	}
	}
