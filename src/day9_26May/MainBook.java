package day9_26May;

public class MainBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book ref;
		EBook b1=new EBook();
		PaperBook b2=new PaperBook();

		b1.getBook(1,  "Python", 1000);
		b1.display();
		ref=b1;
		ref.price();

		b2.getBook(2,  "Java", 700);
		ref=b2;
		b2.display();
		ref.price();
	}

}
