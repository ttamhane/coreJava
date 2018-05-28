package Day3_5May;
//Write a program to find even, odd and zeros in a mumber i.e num =12051, print even =1, odd =3, zero =1

public class CountTotalNumberTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		int num= 1201, evencount=0, oddcount=0, zerocount=0, rem=0;
		do
		{
			rem= num%10;
			num= num/10;
			if (rem==0)
			{
				zerocount++;
			}
			else if (rem %2 ==0)
			{
				evencount++;
			}
			else oddcount++;

		} while (num>0);
		System.out.println(oddcount);
		System.out.println(evencount);
		System.out.println(zerocount);
	}

}
