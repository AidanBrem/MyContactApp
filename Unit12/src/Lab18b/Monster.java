package Lab18b;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private static int myWeight;
	private static int myHeight;
	private static int myAge;

	//write a default Constructor
	public static void Monster() {
		
	}


	//write an initialization constructor with an int parameter ht
	public static void Monster(int ht) {
		SetHeight(ht);
	}


	//write an initialization constructor with int parameters ht and wt
	public static void Monster(int ht, int wt) {
		SetHeight(ht);
		SetWeight(wt);
	}



	//write an initialization constructor with int parameters ht, wt, and age
	public static void Monster(int ht, int wt, int age) {
		SetHeight(ht);
		SetWeight(wt);
		SetAge(age);
	}


	//modifiers - write set methods for height, weight, and age
	public static void SetHeight(int ht) {
		myHeight = ht;
	}
	
	public static void SetWeight(int wt) {
		myWeight = wt;
	}
	
	public static void SetAge(int age) {
		myAge = age;
	}
	
	
	//accessors - write get methods for height, weight, and age
	
	
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster();
	}

	public boolean equals( Object obj )
	{


		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;





		return -1;
	}

	//write a toString() method
	
	
}