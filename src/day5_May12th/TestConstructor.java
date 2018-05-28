package day5_May12th;

public class TestConstructor 
{
	int a1, b1;
	TestConstructor (int a, int b)
	{
		a1=a;
		b1=b;
	}
	void show()
	{
		System.out.println(a1);
		System.out.println(b1);
	}

public static void main(String[] args) 
{
TestConstructor t1= new TestConstructor(10,20);
t1.show();
}
}
