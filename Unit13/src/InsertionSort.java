//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list = new ArrayList<String>();
	int loc = 0;
	public InsertionSort()
	{
		
		


	}
	
	public String Sort() {
		String output = " ";
		//System.out.println("here we go");
		if (list.size() > 1) {
			for (int i = 0; i < list.size(); i++) {
				for (int x = i+1; x < list.size(); x++) {
					String word1 = list.get(i);
					String word2 = list.get(x);
					for (int size = 0; size < word1.length(); size++) {
						if (size > word2.length()) {
							//System.out.println("Broken because " + word1 + " is greater than " + word2);
							break;
						}
						if ((int)word2.charAt(size) < (int)word1.charAt(size)) {
							//System.out.println(word1 + " " + word2);
							//System.out.println(word1.charAt(size) + " " + word2.charAt(size));
							//System.out.println((int)word1.charAt(size) + " " + (int)word2.charAt(size));
							//System.out.println("switching " + word1 + " at index " + x + " with " + word2 + " at index " + i);
							list.set(i, word2);
							list.set(x, word1);
							//x++;
						}
						
						else {
							break;
						}
					}
				}
				output += list.get(i) + " ";
			}
			
			
		}
		
		else {
			output += list.get(0);
		}
		
		return output;
	}

	//modfiers
	public void add( String  word)
	{
		list.add(word);
	}


	public void remove(String word)
	{
		
		for (int i = 0; i < list.size(); i++) {
			if (word.equals(list.get(i))) {
				list.remove(i);
			}
		}






	}
	

	public String toString()
	{
		return "";
	}
}