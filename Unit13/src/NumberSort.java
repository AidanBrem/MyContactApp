//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown
	private static int digits;
	private static int getNumDigits(int number)
	{
		int count = 0;

		for (int i = 1; i < number; i++) {
			if (number / (Math.pow(10, i)) > 1 ) {
				count++;
			}
			
			else {
				break;
			}
		}
		count++;
		//System.out.println(count);












		
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		System.out.println(number);
		digits = getNumDigits(number);
		int[] sorted = new int[digits];
		
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = number % 10;
			number -= (number % 10);
			if (number % 10 == 0) {
				number /= 10;
			}
			//System.out.println(number);
			System.out.println(sorted[i]);
		}
		
		//time to sort boys
		int val = 0;
		for (int i = 0; i < sorted.length; i++) {
			for (int x = sorted.length - 1; x > i; x--) {
				if (sorted[x] < sorted[i]) {
					int tempX = sorted[i];
					sorted[i] = sorted[x];
					sorted[x] = tempX;
				}
			}
			
			//System.out.println(sorted[i]);
		}
		return sorted;
	}
}