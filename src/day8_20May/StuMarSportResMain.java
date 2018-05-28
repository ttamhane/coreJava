package day8_20May;

public class StuMarSportResMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Results r1= new Results();
		r1.getDetails(1112, 15, "Amit");
		r1.getMarks(100, 98, 0);
		r1.getsportsmarks(88);
		r1.caltotal();	
		int avg = r1.totalmarks/4;
		System.out.println("Name: "+r1.name);
		System.out.println("Age: "+ r1.age);
		System.out.println("Id: "+r1.id);
		System.out.println("Average : "+ avg);
		System.out.println("Percentage is : " + avg+"%");
		if (avg>90)
		System.out.println(" Grade  : A");
		else if (avg >70 && avg <90)
		System.out.println(" Grade  : B");
		else if (avg >40 && avg <70)		
		System.out.println(" Grade  : C");
		else 
		System.out.println("Grade : Fail");	

	}


}
