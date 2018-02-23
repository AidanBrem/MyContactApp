//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public String AnalyzeChar(char c)
	{
		if (c >= 48 && c < 58) {
			return "number";
		}
		else if (c >= 65 && c < 91) {
			return "upper";
		}
		else if (c >= 97 && c < 123) {
			return "lower";
		}
		else {
			return "symbol";
		}

	}

	public int getASCII( )
	{
		return 0;
	}

}