//Main method for admin-> employee -> person, \create objects and show all values
package day7_19May;

public class MainEmpPerAdm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin a1=new Admin();
		a1.acceptData("Mayank", 35, "Pune");
		a1.acceptDetails(44910, 70000);
		a1.setAllowance(25000);
		a1.calTotalSal();
		a1.show();
		a1.display();		
	}

}
