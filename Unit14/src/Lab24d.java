//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("H:\\APCS\\workspace\\Unit14\\src\\Lab24d.dat"));
		
		int numGames = file.nextInt();
		file.nextLine();
		for (int i = 0; i < numGames; i++) {
			TicTacToe tictac = new TicTacToe(file.nextLine());
			System.out.println(tictac);
		}








	}
}



