//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{


	public String removeLetters(String sentence, char removal)
	{
		String cleaned;
		char[] chars = sentence.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == removal) {
				chars[i] = ' ';
			}
		}
		cleaned = String.valueOf(chars);




		return cleaned;
	}

}