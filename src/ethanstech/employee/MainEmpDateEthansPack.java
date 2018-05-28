package ethanstech.employee;
import ethanstech.utility.Date;

public class MainEmpDateEthansPack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date(21,12,1983);
		EmployeeInfo e=new EmployeeInfo(44910, 70000, 29, "Preeti", d);
		e.showData();
	}

}
