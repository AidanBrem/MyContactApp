//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;
public class Lab14d
{
	public static void main( String args[] )
	{
		//add test cases
		Scanner keyboard  = new Scanner(System.in);
		
		Grades grade = new Grades();
		int length = keyboard.nextInt();
		
		double [] grades = new double[length];
		
		for (int i = 0; i < grades.length; i++) {
			grades[i] = keyboard.nextDouble();
		}
		
		for (int i = 0; i < grades.length; i++) {
			System.out.println("grade " + (i + 1) + " :: " +  grades[i]);
		}
		
		System.out.println("average = " + grade.Grades(grades));
	}
}