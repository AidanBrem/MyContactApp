//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;
public class Lab09i
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner (System.in);
		LoopStats primes = new LoopStats();
		int num = keyboard.nextInt();
		if (primes.Prime(num) == true) {
			System.out.println(num + " is prime");
		}
		else {
			System.out.println(num + " is not prime");
		}
		
		
					
	}
}