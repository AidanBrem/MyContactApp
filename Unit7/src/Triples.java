//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public void setNum(int num)
	{
		number = num;

	}
	public int[] PythagFinder(int c) {
		int [] nums = new int[3];
		for (int a = 1; (a*a) < (c * c); a++) {
			for (int b = a + 1; (b * b) < (c * c); b++) {
				if ((a * a) + (b * b) == (c * c)) {
					nums[0] = a;
					nums[1] = b;
					nums[2] = c;
					return nums;
				}
			}
		}
		
		nums[0] = 0;
		return nums;
		
	}
	
	
	public boolean greatestCommonFactorPass(int a, int b, int c)
	{
		int max = 0;
		for (int i = 2; i < a; i++) {
			if ( a % i == b % i && a % i == c % i) {
				return false;
			}
		}
		return true;
	}
	


}