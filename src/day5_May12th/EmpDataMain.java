//Write a program to input data for 3 employees and display; then display emp with highest salary.
package day5_May12th;

public class EmpDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpData e1= new EmpData();
		EmpData e2= new EmpData();		
		EmpData e3= new EmpData();
		e1.getData(1, "Amit", 30, 120000 );
		e2.getData(2, "Preeti",25, 80000);
		e3.getData(3, "Sangeeta", 32, 70000);
		//e1.show();
		//e2.show();
		//e3.show();

		if ((e1.sal>e2.sal) && (e1.sal>e3.sal))
		{
			System.out.println("Employee with highest salary is "+e1.name);
			System.out.println("Emp id: "+e1.id);
		}
		else if (e2.sal>e3.sal)
		{
			System.out.println("Employee with highest salary is "+e2.name);
			System.out.println("Emp id: "+e2.id);
		}
		else
		{
			System.out.println("Employee with highest salary is "+e3.name);
			System.out.println("Emp id: "+e3.id);
		}
	}
}
