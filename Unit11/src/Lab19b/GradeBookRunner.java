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

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is the name of this class? ");
		
		String ClassName = keyboard.next();
		
		System.out.println("How many students are in this class?");
		
		int people = keyboard.nextInt();
		Student[] array = new Student[people];
		
		for (int i = 0; i < people; i++) {
			System.out.println("Enter the name for student " + (i + 1));
			String studentName = keyboard.next();
			System.out.println("Use the format x - grades (2 - 100 100) : ");
			String studentGrades = keyboard.next();
			System.out.println(studentGrades);
			array[0] = new Student(studentName, studentGrades);
		} 
		
		System.out.println(ClassName);
		for (int i = 0; i < people; i++) {
			System.out.println(array[i]);
		}



















	}		
}