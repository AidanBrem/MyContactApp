//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		//add test cases
		Scanner keyboard = new Scanner(System.in);
		Distance distance = new Distance();
		
		System.out.println("Enter X1: ");
		double x1 = keyboard.nextDouble();
		System.out.println("Enter Y1: ");
		double y1 = keyboard.nextDouble();
		System.out.println("Enter X2: ");
		double x2 = keyboard.nextDouble();
		System.out.println("Enter Y2: ");
		double y2 = keyboard.nextDouble();
		System.out.println("The distance is: " + distance.calcDistance(x1, y1, x2, y2));
		
		
			
	}
}