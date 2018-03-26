//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
									
	   int curY = 0;
	   //System.out.println("LETS GO");
	   for (int i = 0; i < atMat.length; i++) {
		   for (int x = 0; x < atMat.length; x++) {
			   if (atMat[i][x] == '@') {
				   System.out.println(i + "," + x + ":");
				   atCount = countAts(i, x);
				   System.out.println(toString());
			   }
		   }
	   }
	}

	public int countAts(int r, int c)
	{

		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		atMat[r][c] = ' ';
		int total = 0;
		
		if (r + 1 < atMat.length) {
			if (atMat[r+1][c] == '@') {
				total++;
				return total + countAts(r+1, c);
			}
		}
		
		if (r - 1 >= 0) {
			if (atMat[r-1][c] == '@') {
				total++;
				return total + countAts(r-1, c);
			}
		}
		
		if (c + 1 < atMat.length) {
			if (atMat[r][c+1] == '@') {
				total++;
				return total + countAts(r, c+1);
			}
		}
		
		if (c - 1 >= 0) {
			if (atMat[r][c-1] == '@') {
				total++;
				return total + countAts(r, c-1);
			}
		}

		return total;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}