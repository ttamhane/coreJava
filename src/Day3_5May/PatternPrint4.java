//Check 2 more ways from the class lesson notes
package Day3_5May;

import javax.swing.plaf.synth.SynthStyle;

public class PatternPrint4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=3; i++)
		{
			for (int j=2; j>=i; j--)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
