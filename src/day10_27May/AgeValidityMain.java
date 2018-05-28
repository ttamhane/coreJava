package day10_27May;

public class AgeValidityMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AgeValidity a = new AgeValidity();
		//a.check(26);
		
		try {
			a.validate(2);
		} catch (AgeNotValidException e) {
			// TODO Auto-generated catch block
			System.out.println("Enter valid age");
		}
	}

}
