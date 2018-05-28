package Day6_13May;

public class Sample 
{
	int a,b;
	Sample (int a, int b)
	{
		this.a=a;
		this.b=b;
		//without this :-initialization part is not done hence on show it displays default values.
		System.out.println("a="+a+ "\nb="+b);
		
	}
	void show()
	{
		System.out.println("a="+a+ "\nb="+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample t= new Sample(11,12);
		t.show();

	}

}
