//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private double num;
	public boolean win = false;
	public int tries = 0;

	public void GuessingGameSetup(int high)
	{
		num = Math.ceil(Math.random() * high);

	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Guess a number! ");
		
		int guess = keyboard.nextInt();
		
		if (guess == num){
			toString(2);
		}
		else if (guess > num) {
			toString(0);
		}
		
		else {
			toString(1);
		}
		
		

	}

	public void toString(int result)
	{
		if (result == 0) {
			String output="Your guess was too high!";
			tries++;
			System.out.println(output);
		}
		else if (result == 1) {
			String output = "Your guess was too low!";
			tries++;
			System.out.println(output);
		}
		else if (result == 2){
			double percentage = ((double)tries / ((double)tries + 1.0) * 100);
			String output = "You win! It took you " + tries + " tries to get it right! You guessed wrong " + percentage + "% of the time!";
			System.out.println(output);
			win = true;
		}
		
	}
}