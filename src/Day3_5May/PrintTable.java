package Day3_5May;

public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2, mul=1, res=0;

		do 
		{
			res=num*mul;
			System.out.println(num +" * "+ mul + " = " + res);
			mul++;
		} while (mul <=10);

		//int num=4, i=1;
		//while (i<=10)
		//{
		//System.out.println(num + "*" + i + " =" + (num*i));
		//i++;
		//}
	}

}
