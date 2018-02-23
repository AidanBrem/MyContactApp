//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		int ascii = letter;
		CharacterAnalyzer test = new CharacterAnalyzer();
		String result = test.AnalyzeChar(letter);
		if (result == "upper") {
			System.out.println(letter + " is an uppercase character");
			
		}
		else if (result == "number") {
			System.out.println(letter + " is a number");
		}
		
		else if (result == "lower") {
			System.out.println(letter + " is an lowercase character");
		}
		
		else {
			System.out.println(letter + " is a Symbol");
		}
		System.out.println("ASCII == " + ascii);
		//add more test cases
		
		
		
		
		
		
		
		

	}
}