/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		Deck test = new Deck(ranks, suits, values);
	
		System.out.println("Is deck empty?" );
		System.out.println(test.isEmpty());
		System.out.println("");
		
		System.out.println("Size: ");
		System.out.println(test.size());
		System.out.println("");
		
		System.out.println("Top card: ");
		System.out.println(test.deal().toString());
		System.out.println();
		}
}
