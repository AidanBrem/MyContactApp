//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;


	public String getFirst(String name)
	{
		int index = name.indexOf(" ");
		return name.substring(0, index + 1);
	}

	public String getLast(String name)
	{
		int index = name.indexOf(" ");
		return name.substring(index + 1, name.length());
	}

 	
}