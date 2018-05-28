package Operation;

public class Addition {
	int a, b, sum;
	float x, y,sub;
	public void add(int a, int b)
	{
		this.a=a;
		this.b=b;
		sum=a+b;
		System.out.println("Number 1: "+ a);
		System.out.println("Number 2: "+ b);
		System.out.println("Sum is "+ sum);
	}
	public float subtract(float x, float y)
	{
		this.x=x;
		this.y=y;
		sub=x-y;
		System.out.println("Number 1: "+ x);
		System.out.println("Number 2: "+ y);
		System.out.println("Substraction is "+ sub);
		return sub;
		
	}

}
