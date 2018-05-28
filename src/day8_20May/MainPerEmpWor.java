//In main create ref of parent class and 
package day8_20May;

public class MainPerEmpWor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1= new Emp(44, 50000, "Tulika");
		Worker w= new Worker(2, "Amit");
		Person ref;
		ref=e1;
		e1.display();
		ref=w;
		w.display();



	}

}
