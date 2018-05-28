package day8_20May;

public class MainAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		admin.acceptData(44, "Amit", 29,  50000);
		admin.setAllowance(10000);

		HR h=new HR();
		h.acceptData(66, "Mayank", 30, 70000);
		h.setIncentive(1000);
			

		Employee emp;
		emp= admin;
		emp.calsal();
		admin.display();
		emp=h;
		emp.calsal();
		
		h.display();
		
	}
}
