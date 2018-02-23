//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;
public class Lab11j
{
   public static void main(String args[])
   {
		Scanner keyboard = new Scanner(System.in);
		
		Triples triple = new Triples();
		
		int max = keyboard.nextInt();
		String validNums = "";
		for (int i = 1; i < max; i++) {
			int list[] = triple.PythagFinder(i);
			if (list[0] != 0) {
				if (triple.greatestCommonFactorPass(list[0], list[1], list[2])) {
					validNums =  list[0] + " " + list[1] + " " + list[2];
					System.out.println("");
					System.out.println(validNums);
				}
			}
		}

   }
}