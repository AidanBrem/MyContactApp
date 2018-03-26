//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		
		Scanner file = new Scanner (new File("H:\\APCS\\workspace\\Unit14\\src\\Lab21i.dat"));
		
		
		//System.out.println(line);
		//line = line.replace(' ', '');
		
		while (file.hasNextLine()) {
			int size = file.nextInt();
			file.nextLine();
			System.out.println(size);
			String line = file.nextLine();
			Maze maze = new Maze(size, line);
			System.out.println("\n\n");
		}
		
	}
}