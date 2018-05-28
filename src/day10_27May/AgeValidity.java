package day10_27May;

public class AgeValidity {
	void check (int age)
	{
		try
		{
			if (age <18)
			{
				throw new AgeNotValidException();
			}
			else
			{
				System.out.println("User is eligible");
			}
			System.out.println("In Check: Outside if else block , end of code");
		}
		catch (AgeNotValidException e)
		{
			System.out.println("In catch block");
			System.out.println(e);

		}
	}
	void validate(int age) throws AgeNotValidException
	{
		if (age <18)
		{
			throw new AgeNotValidException("Age not valid");
		}
		else
		{
			System.out.println("User is eligible");
		}
		System.out.println("in Validate : Outside if else block , end of code");
	}
}
