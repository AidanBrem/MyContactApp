//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Lab09f
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Insert string:");
		String sentence = keyboard.nextLine();
		System.out.println("Inset Character to be removed: ");
		char character = keyboard.next().charAt(0);
		
		LetterRemover cleaner = new LetterRemover();
		System.out.println(cleaner.removeLetters(sentence, character));
											
	}
}