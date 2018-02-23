//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;


	public boolean Prime(int num) {
		int divisors = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisors++;
			}
		}
		
		if (divisors == 2 ) {
			return true;
		}
		else {
			return false;
		}
	}

	public int getTotal(int start, int stop)
	{
		int total=0;
		for (int i = start; i <= stop; i++) {
			total = total + i;
		}



		return total;
	}
	
	public String toString()
	{
		return start + " " + stop;
	}
}