//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab14i
{
	public static void main( String args[] )
	{
		RomanNumeral test = new RomanNumeral();
		out.println("10 is " + test.setRomanString(10));
		out.println("100 is " + test.setRomanString(100));
		out.println("1000 is " + test.setRomanString(1000));
		out.println("2500 is " + test.setRomanString(2500));
		out.println("1500 is " + test.setRomanString(1500));
		out.println("23 is " + test.setRomanString(23));
		out.println("38 is " + test.setRomanString(38));
		out.println("49 is " + test.setRomanString(49));
		
		out.println("LXXVII is " + test.setRomanGetInt("LXXVII") + "\n");

		out.println("XLIX is " + test.setRomanGetInt("XLIX") + "\n");

		out.println("XX is " + test.setRomanGetInt("XX") + "\n");


		out.println("XXXVIII is " + test.setRomanGetInt("XXXVIII") + "\n");
	}
}