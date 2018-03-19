package lab18e;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import lab18d.Word;

import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\APCS\\workspace\\Unit12\\src\\lab18e\\lab18e.dat"));

		int size = file.nextInt();
		int count = 0;
		lab18e.Word[] words = new lab18e.Word[size];
		while (file.hasNextLine() && count < 10) {
			String word = file.nextLine();
			System.out.println(word);
			words[count] = new lab18e.Word(word);
			count++;
		}
		
		for (int n = 0; n < words.length; n++) {
			lab18e.Word word = new lab18e.Word(words[n].toString());
			for (int i = 1; i < words.length; i++) {
				lab18e.Word tempWord = new lab18e.Word(words[i].toString());
				if (word.numVowels() == tempWord.numVowels()) {
					if (words[n].compareTo(words[i]) > 0) {
						lab18e.Word temp = words[n];
						words[n] = words[i];
						words[i] = temp;
					}
				}
				if (word.numVowels() < tempWord.numVowels()) {
					lab18e.Word temp = words[n];
					words[n] = words[i];
					words[i] = temp;
				}
			}
		}
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}











	}
}