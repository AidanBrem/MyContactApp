//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Lab11c
{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		TriangleThree triangle = new TriangleThree();
		
		int size = keyboard.nextInt();
		String letter = keyboard.next();
		
		triangle.setTriangle(letter, size);
		triangle.DEWIT();
	}
  
}