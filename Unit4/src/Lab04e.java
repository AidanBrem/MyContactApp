//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab04e
{
	public static void main ( String[] args )
	{
		StringChecker demo = new StringChecker();
		System.out.println("looking for c... " + demo.check("chicken", "c"));
		System.out.println("looking for ch... " + demo.check("chicken", "h"));
		System.out.println("looking for x... " + demo.check("chicken", "x"));
		
		System.out.println("");
		System.out.println("looking for g... " + demo.check("alligator", "g"));
		System.out.println("looking for all... " + demo.check("alligator", "all"));
		System.out.println("looking for gater... " + demo.check("alligator", "gater"));

		System.out.println("");
		System.out.println("looking for U... " + demo.check("COMPUTER SCIENCE IS THE BEST", "U"));
		System.out.println("looking for COMP SCI... " + demo.check("COMPUTER SCIENCE IS THE BEST", "COMP SCI"));
		System.out.println("looking for SCIENCE... " + demo.check("COMPUTER SCIENCE IS THE BEST", "SCIENCE"));
	}
}