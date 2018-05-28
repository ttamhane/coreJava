package day10_27May;

public class Registration {
	int userid;
	String name, password;
	void accept(int userid, String name, String password)
	{
		this.userid=userid;
		this.name=name;
		try
		{
			if (password.length()>12)
			{
				throw new PwdLengthExceptionMore();
			}
			else if (password.length()<8)
			{
				throw new PwdLengthExceptionLess();
			}
			else
			{
				this.password=password;

			}
		} catch (PwdLengthExceptionMore e)
		{
			System.out.println(e);
		} 
		catch (PwdLengthExceptionLess f)
		{
			System.out.println(f);
		}
	}
	
		void display()
		{
			System.out.println("User id : " +userid);
			System.out.println("Name : " +name);
			System.out.println("Passowrd : " +password);
		}

	}
