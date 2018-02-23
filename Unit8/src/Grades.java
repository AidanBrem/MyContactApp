//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	double sum = 0.0;
	double average;
	
	//constructor
	public double Grades(double list[]) {
		sum = getSum(list);
		double average = getAverage(list);
		
		return average;
	}

	//set method



	private double getSum(double x[])
	{
		double total = 0.0;
		for (int i = 0; i < x.length; i++ ) {

			total += x[i];
		}
		
		return total;
	}

	public double getAverage(double x[])
	{
		average=0.0;
		
		average = sum / x.length;
		


		return average;
	}


	//toString method

	


}