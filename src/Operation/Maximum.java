package Operation;

public class Maximum {
int a,b,c,x;
public void max1(int a, int b)
{
	this.a=a;
	this.b=b;
	x=(a>b)?a:b;
	System.out.println("Number 1: "+ a);
	System.out.println("Number 2: "+ b);
	System.out.println("Larger number is "+ x);

}

public void max2(int a, int b, int c)
{
	this.a=a;
	this.b=b;
	this.c=c;
	x=((a>b)&&(a>c))?a:((b>c)?b:c);
	System.out.println("Number 1: "+ a);
	System.out.println("Number 2: "+ b);
	System.out.println("Number 3: "+ c);
	System.out.println("Larger number is "+ x);

}
	
}
