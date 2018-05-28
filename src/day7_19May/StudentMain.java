package day7_19May;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(81, 15, 99, "Urvashi");
		System.out.println(s1); //internally compiler will invoke as s1.toSring 
		System.out.println(s1.toString());//when ever u print any obj this toString is invoked.
		//Always to String will print string equivalent of the object.
	

	}

	
}
