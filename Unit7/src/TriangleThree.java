//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;
   private String output = "";

	public void DEWIT()
	{
		int currentRow = 1;
		for (int i = 0; i < size; i++) {
			for (int z = 0; z < currentRow; z++) {
				output = output + letter;
			}
			
			currentRow += 1;
			
			output = output + "\n";
		}
		
		System.out.print(output);
	}

	

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

}