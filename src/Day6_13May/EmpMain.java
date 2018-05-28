//Main employee class - objects created using constructor as well as by calling accept data.
//count of total objects created is also displayed.
//example of static method also included
package Day6_13May;

public class EmpMain {
	/*static int y=1;
	static void print()
	{
		System.out.println("In static method .....");
		System.out.println("count of y is "+ y);
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Count is "+Employee.x);
		Employee e1 = new Employee(1, "Tulika", 30, 25000);
		e1.show();
		Employee e2=new Employee();
		e2.acceptData(2,  "Amit", 32, 20000);
		e2.show();
		Employee e4=new Employee();
		Employee e3 = new Employee(3, "Snehal", 34, 15000);
		e3.show();
		System.out.println("Number of objects created is "+Employee.x);
	}

}

