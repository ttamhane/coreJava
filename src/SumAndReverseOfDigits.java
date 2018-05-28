// Write a program to find sum and reverse of digits in a 2 digit number
public class SumAndReverseOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23, sum, rev;
		int d1=num/10;
		int d2=num%10;
		sum=d1+d2;
		rev=((d2*10)+d1);
		System.out.println("Number entered is "+num);
		System.out.println("sum of digits is "+sum);
		System.out.println("reverse of the number is "+rev);

	}

}
