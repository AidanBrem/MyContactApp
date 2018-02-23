//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	 public static void main( String args[] )
	 {
		   Scanner keyboard = new Scanner(System.in);

		   GuessingGame game = new GuessingGame();
		   System.out.println("Welcome to the Guessing Game! How high are we going today?");
		   int high = keyboard.nextInt();
		   game.GuessingGameSetup(high);
		   do {
			   game.playGame();
			   game.toString();
		   } while (!game.win);

		   




	}
}