		package day10_27May;
		//Finally block with try catch example
		
		public class FinallyExample {
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				try
				{
					int a=10, b=0;
					int c=a/b;
					System.out.println(c);
					/*int arr[] = {10,20,30};
					System.out.println(arr[0]); // java.lang.ArrayIndexOutOfBoundsException will be thrown
					System.out.println("End of Code");*/
				}
				catch (ArithmeticException e)
				{
					System.out.println("In catch : "+e);
					System.out.println("Please check second number cannot be zero");
				}
				finally
				{
					System.out.println("In finally block");
				}
				System.out.println("End of try catch block");
		
			}
		}
