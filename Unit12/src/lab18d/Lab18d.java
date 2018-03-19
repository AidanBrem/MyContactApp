package lab18d;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\APCS\\workspace\\Unit12\\src\\lab18d\\lab18d.dat"));

		int size = file.nextInt();
		int count = 0;
		Word[] words = new Word[size];
		while (file.hasNextLine() && count < 10) {
			String word = file.nextLine();
			System.out.println(word);
			words[count] = new Word(word);
			count++;
		}
		for (int n = 0; n < words.length; n++) {
			for (int i = 1; i < words.length; i++) {
				if (words[n].compareTo(words[i]) > 0) {
					Word temp = words[n];
					words[n] = words[i];
					words[i] = temp;
				}
			}
		}
		
		for (int i = 0; i< words.length; i++) {
			System.out.println(words[i]);
		}
		
		
		
		











	}
}