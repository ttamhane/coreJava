package day9_26May;

public abstract class Book {
	int id, cost;
	String bookname;
	abstract void price();
	void getBook(int id, String bookname, int cost)
	{
		this.id=id;
		this.bookname=bookname;
		this.cost=cost;
	}
	void display()
	{
		System.out.println(id);
		System.out.println(bookname);
		System.out.println(cost);
	}
}
