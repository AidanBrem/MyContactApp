package lab18e;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import lab18d.Word;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		word = s;
	}

	int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;

		//System.out.println("We're TRIGGERED");
		for (int i = 0; i < word.length(); i++) {
			for (int n = 0; n < vowels.length(); n++) {
				if (word.charAt(i) == (vowels.charAt(n))) {
					vowelCount++;
				}
			}
		}






		return vowelCount;
	}

	public int compareTo( Word rhs )
	{
		
		if (rhs.toString().length() > word.length()) {
			return 1;
		}
		
		else if (rhs.toString().length() < word.length()) {
			return -1;
		}
		
		
		
		else {
			for (int i = 0; i < word.length(); i++) {
				if ((int)word.charAt(i) > (int)rhs.toString().charAt(i)) {
					return 1;
				}
				
				else if ((int)word.charAt(i) < (int)rhs.toString().charAt(i)) {
					return -1;
				}
			}
		}
		return 0;
	}


	public String toString()
	{
		return word;
	}
}