//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public boolean check(String str, String checkstr) {
		if (str.indexOf(checkstr) >= 0) {
			return true;
		}
		else {
			return false;
		}
	}
}