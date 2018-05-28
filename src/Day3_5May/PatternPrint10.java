package Day3_5May;

public class PatternPrint10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=-1, rows=4;
for (int i=1; i<=rows; i++)
{
	for (int j=1; j<=i; j++)
	{
		num =num+2;
		System.out.print(num);
		System.out.print('\t');
	}
	System.out.println();
	
}
		
	}

}
