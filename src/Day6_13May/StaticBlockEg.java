//Sample to show static block
package Day6_13May;

public class StaticBlockEg {

	static //Static block to print a statement.
	{
		System.out.println("In static block 1");
	}
	static //Static block to print a statement.
	{
		System.out.println("In static block 2");
	}
	static //Static block to  check the OS, if Windows then proceed else if Linux then exit
	// once it exits it will not go to the main method also.
	{
		String op_sys= System.getenv("OS"); //Use static method os system class and get the OS
		System.out.println(op_sys);
		if (op_sys.equals("Linux"))
		{
			System.out.println("U can proceed");
		}
		else
		{
			System.out.println("check ur os");
			System.exit(0);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main method");
	}

}
