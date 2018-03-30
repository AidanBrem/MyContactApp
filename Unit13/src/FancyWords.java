//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private char[] wordRay;
	private char[][] mat;
	public FancyWords(String sentence)
	{
		char[][] mat = new char[sentence.length()][sentence.length()];
		int spaceCount = 0;
		//System.out.println(sentence);
		//Find largest sentence for matrix y
		String[] splitString = sentence.split(" ");
		//for (int i = 0; i < splitString.length; i++) {
			//System.out.println(splitString[i]);
		//}
		int largestSen = splitString[0].length();
		//System.out.println(largestSen);
		for (int i = 1; i < splitString.length; i++) {
			int tempLen = splitString[i].length();
			
			if (tempLen > largestSen) {
				largestSen = tempLen;
				//System.out.println(largestSen);
			}
		}
		//System.out.println("largest sentence length (rows): " + largestSen);
		//System.out.println("number of collums: " + splitString.length);
		//System.out.println(largestSen);
		mat = new char[splitString.length][largestSen];
		//System.out.println(mat[0].length + " " + mat.length);
		int curY = 0;
		for (int x = 0; x < mat.length; x++) {
			for (int y = 0; y < mat[0].length; y++) {
				//System.out.println(y);
				//System.out.println(x);
				String string = splitString[splitString.length - curY - 1];
				//System.out.println("string: " + string);
				//System.out.println(x);
				//System.out.println("y " + y);
				
				if (string.length() - y - 1 >= 0) {
					mat[x][y] = string.charAt(string.length() - y - 1);
				}
				
				else {
					break;
				}
				
			}
			curY++;
		}
		System.out.println(mat[0].length);
		System.out.print(toString(mat));

	}

	public String toString(char[][] mat1)
	{
		String output="";
		int max = Integer.MIN_VALUE;
		for (int y = 0; y < mat1[0].length; y++) {
			for (int x = 0; x < mat1.length; x++) {
				output += mat1[x][y] + " ";
			}
			
			output += "\n";
		}





		return output+"\n\n";
	}
}