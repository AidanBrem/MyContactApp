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

public class Student
{
	private String myName;
	private Grades myGrades;
	//Grades getGrade = new Grades();
	
	//public Student()
	//{
		//System.out.println("starting...");
		//setName("");
		//setGrades("");
	//}
	
	public Student(String name, String gradeList)
	{
		//System.out.println("TRIGGERED REEEE!");
		//System.out.println(gradeList);
		setName(name);
		myGrades = new Grades(gradeList);
		//System.out.println(myGrades);

	}
	
	public void setName(String name)
	{
		myName = name;

	}	
	
	public void setGrades(String gradeList)
	{
		//System.out.println("TRIGGERED REEEEEEE");
	
	}
	
	//public void setGrade(int spot, double grade)
	//{


	//}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return myGrades.getAverage();
	}

	public double getAverageMinusLow()
	{
		return myGrades.getAverageNoLow();
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();
	}
	
	public String toString()
	{
		String output = "";
		//System.out.println(myGrades);
		output += getName() +  " " + myGrades.toString();
		//System.out.println(output);
		return output;
	}	
}