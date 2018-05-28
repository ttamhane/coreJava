//write a program to print sum of n numbers (i.e 5+4+3+2+1)
public class SumUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3, sum=0;
		while (num >= 1)
		{
			sum=sum+num;
			num--;
		}
		System.out.println(sum);

	}

}
