//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private int number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};


	public int setRomanGetInt(String rom)
	{
		number = 0;
		int index = 0;
		for (int i = 0; i < rom.length(); i++) {
			for (int x = i; x < LETTERS.length; x++) {
				if (i != rom.length() - 1) {
						if (rom.substring(i, i + 2).equals(LETTERS[x])) {
						index = x;
						number += NUMBERS[index];
						i++;
						break;
					}
				}

					
				if (rom.valueOf(rom.charAt(i)).equals( LETTERS[x]) || i == rom.length()) {
					index = x;
					number += NUMBERS[index];
					break;
				}
				
			}
			
				
		}
			
			
			
		return number;

	}
	
	public String setRomanString(int rom) {
		String returnstring = "";
		int number = rom;
		boolean done = true;
		while (done == true) {
			if (number >= 1000) {
				returnstring += "M";
				number -= 1000;
				
				
			}
			
			else if (number >= 900) {
				returnstring += "CM";
				number -= 900;
			}
			
			else if (number >= 500) {
				returnstring += "D";
				number -= 500;
			}
			
			else if (number >= 400) {
				returnstring += "CD";
				number -= 400;
			}
			
			else if (number >= 100) {
				returnstring += "C";
				number -= 100;
			}
			
			else if (number >= 90) {
				returnstring += "XC";
				number -= 90;
			}
			
			else if (number >= 50) {
				returnstring += "L";
				number -= 50;
			}
			
			else if (number >= 40) {
				returnstring += "XL";
				number -= 40;
			}
			
			else if (number >= 10) {
				returnstring += "X";
				number -= 10;
			}
			
			else if (number >= 9) {
				returnstring += "IX";
				number -= 9;
			}
			
			else if (number >= 5) {
				returnstring += "V";
				number -= 5;
			}
			
			else if (number >= 4) {
				returnstring += "IV";
				number -= 4;
			}
			
			else if (number >= 1) {
				returnstring += "I";
				number -= 1;
			}
			
			else {
				break;
			}
			
			
		}
	
		return returnstring;
	}
}