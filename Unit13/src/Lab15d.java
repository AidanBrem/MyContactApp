//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{

		Scanner file = new Scanner (new File("H:\\APCS\\workspace\\Unit13\\src\\Lab15d.dat"));

		int size = file.nextInt();
		System.out.println(size);
		file.nextLine();
		for (int i = 0; i < size; i++) {
			FancyWords word = new FancyWords(file.nextLine());
		}




	}
}