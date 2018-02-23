//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;
public class Lab08g
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner (System.in);
		LoopStats add = new LoopStats();
		int start = keyboard.nextInt();
		int stop = keyboard.nextInt();
		System.out.println(add.getTotal(start, stop));
		
		
		
					
	}
}