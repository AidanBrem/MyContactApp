package Lab19b;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		//System.out.println("YAY");
		setGrades(gradeList);
		
		toString(grades);
	}
	
	public void setGrades(String gradeList)
	{
		//System.out.println("we're starting!");
		//System.out.println("grade list is " + gradeList);
		String[] parts = gradeList.split(" -");
		//System.out.println(parts[1]);
		String part1 = parts[0];
		//System.out.println(part1);
		String part2 = parts[1];
		//System.out.println(part2);
		int numGrades = Integer.parseInt(part1);
		grades = new double[numGrades];
		int index = 0;
		boolean checkNum = false;
		//System.out.println(part2.length());
		for (int i = 0; i < part2.length(); i++) {
			if (Character.toString(part2.charAt((i))).equals(" ")) {
				checkNum = true;
			}
			
			else if (checkNum == true) {
				int curIndex = i;
				//System.out.println("at index " + curIndex);
				double curNum = 0;
				double mag = 1;
				do {
					if (part2.charAt(curIndex) == ' ') {
						break;
					}
					char character = part2.charAt(curIndex);
					if (curIndex == 19) {
						break;
					}
					if (Character.toString(character).equals(" ")) {
						//System.out.println("we are breaking!");
						break;
					}
					
					else if (Character.toString(character).equals(".")) {
						curIndex++;
					}
					else {
						//System.out.println("character: " + Character.toString(character));
						//System.out.println("adding " + (Double.parseDouble(Character.toString(character)) * (10.0 * mag)));
						curNum += Double.parseDouble(Character.toString(character)) * (10 * mag);
						//System.out.println("number is " + curNum);
						
						mag *= 0.1;
						curIndex++;
					}
					
					if (mag == 0.010000000000000002 && curNum == 10) {
						curNum = 100;
						break;
					}
					
				} while (curIndex < part2.length());
				//System.out.println("we are at " + index + " " + curNum);
				grades[index] = curNum;
				//System.out.println(curNum);
				index++;
				checkNum = false;
			}
		}
			
		


	}
	
	public String getLetterGrade(double grade) {
		if (grade >= 90.0) {
			return "A";
		}
		
		if (grade >= 80) {
			return "B";
		}
		
		if (grade >= 70) {
			return "C";
		}
		
		if (grade >= 60) {
			return "D";
		}
		
		else {
			return "F";
		}
	}
	public double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}



		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < low) {
				low = grades[i];
			}
		}




		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > high) {
				high = grades[i];
			}
		}




		return high;
	}
	
	public double getAverage() {
		double avg = 0;
		
		for (int i = 0; i < grades.length; i++) {
			avg += grades[i];
		}
		
		avg /= grades.length;
		
		return avg;
	}
	
	public double getAverageNoLow() {
		double avg = 0;
		double FindLow = getLowGrade();
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] != FindLow) {
				avg += grades[i];
			}
			
		}
		
		avg /= (grades.length - 1);
		
		return avg;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	
	public String toString( double[] grades )
	{
		String output="";
		for (int i = 0; i < grades.length; i++) {
			output += grades[i];
			output += "\n";
			//output += getLetterGrade(grades[i]);
//			/output += "\n";
		}
		
		//System.out.println(output);
		return output;
		
		//System.out.println(output);




	}	
}