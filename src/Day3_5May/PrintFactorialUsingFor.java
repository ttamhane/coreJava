//Print factorial using For loop
package Day3_5May;

public class PrintFactorialUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1; 
		for (int num=3; num>0; num--)
		{
			fact =fact*num;
		}
		System.out.println("Factorial is" + fact);
	}

}

