//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	//add test cases
		Scanner keyboard = new Scanner(System.in);
		Quadratic quad = new Quadratic();
		
		System.out.println("insert first Coeffecient: ");
		double cof1 = keyboard.nextDouble();
		System.out.println("insert second Coeffecient: ");
		double cof2 = keyboard.nextDouble();
		System.out.println("insert third Coeffecient: ");
		double cof3 = keyboard.nextDouble();
		System.out.println("The first root is : " + quad.calcRootA(cof1, cof2, cof3));
		System.out.println("The second root is : " + quad.calcRootB(cof1, cof2, cof3));
	}
}