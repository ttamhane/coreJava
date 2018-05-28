//Write a program to print the quadrant of a number.
public class QuadrantOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=-99, y=-0;
		if (x>0 && y>0)
			System.out.println("Number lies in 1st quadrant");
		else if (x<0 && y>0)
			System.out.println("Number lies in 2nd quadrant");
		else if (x<0 && y<0)
			System.out.println("Number lies in 3rd quadrant");
		else if (x>0 && y<0)
			System.out.println("Number lies in 4th quadrant");
		else if (x!=0 && y==0)
			System.out.println("Number lies on X axis");
		else if (x==0 && y!=0)
			System.out.println("Number lies on Y axis");
		else if (x==0 && y==0)
			System.out.println("Number is On origin");
	}

}
