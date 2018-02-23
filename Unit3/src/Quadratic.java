//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public double calcRootA(double A, double B, double C)
	{
		rootOne = ((-B + Math.sqrt((B * B) - (4 * A * C)))/(2 * A));
		return rootOne;
	}

	public double calcRootB(double A, double B, double C)
	{
		rootTwo = ((-B - Math.sqrt((B * B) - (4 * A * C)))/(2 * A));
		return rootTwo;
	}
	public void print( )
	{

	}
}