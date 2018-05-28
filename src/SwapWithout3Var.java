//Write a program to swap 2 numbers without using a third variable
public class SwapWithout3Var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		System.out.println("Value of a is " +a);
		System.out.println("Value of b is "+ b);
		b= a+b;
		a=b-a;
		b=b-a;
		System.out.println("Value of a is " +a);
		System.out.println("Value of b is "+ b);
	}

}
