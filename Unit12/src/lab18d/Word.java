package lab18d;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	//private int length;
	public Word( String s )
	{
		word = s;
		//length = s.length();
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