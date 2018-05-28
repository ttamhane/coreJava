//Write a program to print an array and print it in reverse order also.
package day4_May;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {10,20,30,40};
for (int i=0; i<(a.length); i++)
{
	System.out.println(a[i]);
}
System.out.println("print in reverse order");
for (int j=((a.length)-1); j>=0; j--)
	System.out.println(a[j]);
	
		
	}

}
