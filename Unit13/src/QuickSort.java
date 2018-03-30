//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static Comparable[] quickSort(Comparable[] list)
	{
		passCount = -1;
		quickSort(0, list.length - 1, list);
		return list;
		
	}
	
	public static Comparable[] quickSort(int lowerIndex, int higherIndex, Comparable[] list) {
		passCount++;
		
		System.out.println("\n");
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = (int)list[lowerIndex + (higherIndex - lowerIndex) / 2];
		System.out.println("pivot index " + (lowerIndex + (higherIndex - lowerIndex) / 2));
		System.out.println("pivot " + pivot);
		while (i <= j) {
			System.out.println("going");
			while(list[i].compareTo(pivot) < 0) {
				System.out.println("True 1");
				i++;
			}
			
			while(list[j].compareTo(pivot) > 0) {
				System.out.println("True 2");
				j--;
			}
			
			if (i <= j) {
				System.out.println("true 3");
				System.out.println(list[i] + " " + list[j]);
				int temp = (int)list[i];
				list[i] = list[j];
				list[j] = temp;
				i++;
				j--;
			}
		}
		
		if (lowerIndex < j) {
			quickSort(lowerIndex, j, list);
		}
		
		if (i < higherIndex) {
			quickSort(i, higherIndex, list);
		}
		
		return list;
		
		
	}
}