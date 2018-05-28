package day9_26May;

public class SampleChild extends Sample{
	void show()
	{
		System.out.println("In SampleChild class");
	}
	
	public static void main (String [] Args)
	{
		SampleChild s=new SampleChild();
		s.show();
	}

}
