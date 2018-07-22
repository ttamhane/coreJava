package day10_27May;

public class ThrowsBuiltInNoTryCatch {
	void division (int a, int b) throws ArithmeticException
	{
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		ThrowsBuiltInNoTryCatch a= new ThrowsBuiltInNoTryCatch();
		a.division(10, 0);
	}

}

