//Write a program to find the largest of 3 numbers using conditional operator
public class LargestOfThreeNosCondOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a= 1000, b=2000, c= 3000, x, y;
		//x= a>b?a:b;
		//y= x>c?x:c;
		//System.out.println("Largest of three numbers that are entered ("+ a + ","+ b + "," + c + ") is " +y);
		
		int a=1000, b=200, c=10;
		System.out.println("Largest of 3 numbers is " + ((a>b && a>c)?a: (b>c?b:c)));
	}

}
