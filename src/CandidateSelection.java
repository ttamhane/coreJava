//Write a program to select candidate based on following criteria:
// if male - age should be > 30 Yrs amd height >160 cm
//if female - age should be > 25 yrs and height > 155 cm

public class CandidateSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender = 'F';
		int height = 160, age = 19;
		if (gender == 'M' || gender == 'm')
		{
			if (age > 30 && height > 160)
			{
				System.out.println("Male candidate is selected");
			}
			else
			{
				System.out.println("Male candidate is rejected");
			}

		}
		else if (gender =='F' || gender == 'f')
		{
			if (age > 20 && height > 155)
			{
				System.out.println("Female candidate is selected");
			}
			else
			{
				System.out.println("Female candidate is rejected");
			}
		}
		else 
			System.out.println("Please enter correct value for gender");
	}

}
