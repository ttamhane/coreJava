//create main method to create objects of child class - employee and display the details.
package day7_19May;

public class MainEmpPer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.acceptData("Tulika", 35, "Pune");
		e1.acceptDetails(44910, 75000);
		e1.show();
	}
}
