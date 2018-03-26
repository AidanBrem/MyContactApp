//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File ("H:\\APCS\\workspace\\Unit14\\src\\lab24b.dat"));
		int size = file.nextInt();
		file.nextLine();
		
		
		for(int i = 0; i<size; i++)
		{
			String word = file.next();
			//System.out.println(word);
			char[][] mat = new char[word.length()][word.length()];
			for (int x = 0; x < word.length(); x++) {
				mat[0][x] = word.charAt(x);
			}
			int indexAt = 1;
			int indexAtNeg = word.length() - 2;
			for (int i1 = 0; i1 < word.length(); i1++) {
				for (int y = 1; y < mat.length / 2; y++) {
					for (int x = 0; x < mat.length; x++) {
						if (x == indexAt && i1 == indexAt && y == indexAt) {
							mat[y][x] = word.charAt(indexAt);
							indexAt++;
						}
						
						if (x == indexAtNeg && i1 == indexAtNeg) {
							mat[y][x] = word.charAt(indexAtNeg);
							indexAtNeg--;
						}
					}
				}
				
			}
			
			int startIndex = 0;
			if (word.length() % 2 != 0) {
				for (int x = 0; x < word.length() - 1; x++) {
					if (x == word.length() / 2) {
						mat[word.length()/2][x] = word.charAt(x);
						startIndex = (word.length() / 2) + 1;
					}
				}
			}
			
			else {
				int curYOffset = -1;
				int index = (word.length() / 2) - 1;
				for (int z = 0; z < 2; z++ ) {
					System.out.println("running for " + (z + 1));
					System.out.println("Working at x index " + index);
					index = (word.length() / 2) - 1;
					System.out.println("Working at x index " + index);
					int numTimes = 0;
					for (int x = 0; x < word.length(); x++) {
						if (x == index) {
							System.out.println("Doing stuff at " + ((word.length() / 2) + z));
							mat[(word.length()/2) - z][x] = word.charAt(index);
							curYOffset--;
							index++;
							numTimes++;
							startIndex = (word.length() / 2) + 2;
							if (numTimes == 2) {
								break;
							}
						}
						
						curYOffset = 1;
					}
				}
			}
			
			if (word.length() % 2 == 0) {
				System.out.println("Length: " + word.length());
				indexAt = 1;
				System.out.println("Going to index " + indexAt + " for word " + word);
				indexAtNeg = (word.length() / 2) + 1;
				System.out.println("Going to index " + indexAtNeg + " for word " + word);
			}
			
			else {
				System.out.println("Length: " + word.length());
				indexAt = 1;
				System.out.println("Going to index " + indexAt + " for word " + word);
				indexAtNeg = (word.length() / 2) + 1;
			}
			//indexAt = word.length() / 2 - 1;
			//indexAtNeg = word.length() - 2;
			startIndex--;
			System.out.println("starting at index " + startIndex);
			System.out.println("Looking for indexAt " + indexAt);
			for (int y = startIndex; y < mat.length - 1; y++) {
				for (int x = 0; x < mat.length; x++) {
					System.out.println("running for x " + (x));
					for (int i1 = 0; i1 < word.length(); i1++) {
						System.out.println(x + "," + i1 + "," + indexAt);
						if (x == indexAt && i1 == indexAt && indexAt < mat.length / 2) {
							System.out.println("BINGO USING CHAR " + word.charAt(indexAt) + " at index " + x);
							mat[(mat.length/2) + indexAt][x - 1] = word.charAt(indexAt);
							indexAt++;
							System.out.println("Next index: " + indexAt);
							break;
						}
						
						if (x == indexAtNeg && i1 == indexAtNeg && y == indexAtNeg) {
							System.out.println("Index reached!");
							mat[y][x] = word.charAt(indexAtNeg);
							indexAtNeg++;
							break;
						}
					}
				}
			}
			
			for (int x = 0; x < word.length(); x++) {
				mat[word.length() - 1][x] = word.charAt(x);
			}
			
			for (int y = 0; y < mat.length; y++) {
				for (int x = 0; x < mat.length; x++) {
					System.out.print(mat[y][x] + " ");
				}
				
				System.out.print("\n");
			}

	   }
		
		
	}
}