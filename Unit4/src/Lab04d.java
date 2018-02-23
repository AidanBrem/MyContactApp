//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab04d
{
	public static void main ( String[] args )
	{
		Name person = new Name();
		System.out.println(person.getFirst("Sally Baker"));
		System.out.println(person.getLast("Sally Baker"));
		
		System.out.println(person.getFirst("John Doe"));
		System.out.println(person.getLast("John Doe"));
		
		System.out.println(person.getFirst("Sammy Lammy"));
		System.out.println(person.getLast("Sammy Lammy"));

		System.out.println(person.getFirst("Benny Programmer"));
		System.out.println(person.getLast("Benny Programmer"));
		
		System.out.println(person.getFirst("Sandy Painter"));
		System.out.println(person.getLast("Sandy Painter"));
	}
}