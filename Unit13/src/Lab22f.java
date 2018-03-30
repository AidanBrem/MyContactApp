//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

public class Lab22f
{
	public static void main(String args[])
	{
		for (int i = 0; i < QuickSort.quickSort(new Comparable[]{9,5,3,2}).length; i++) {
			System.out.print(QuickSort.quickSort(new Comparable[]{9,5,3,2})[i] + " ");
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < QuickSort.quickSort(new Comparable[]{19,52,3,2,7,21}).length; i++) {
			System.out.print(QuickSort.quickSort(new Comparable[]{19,52,3,2,7,21})[i] + " ");
		}
		
		System.out.println("\n");
		

		for (int i = 0; i < QuickSort.quickSort(new Comparable[]{68,66,11,2,42,31}).length; i++) {
			System.out.print(QuickSort.quickSort(new Comparable[]{68,66,11,2,42,31})[i] + " ");
		}
	}
}


