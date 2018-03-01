/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card card1 = new Card("Jack", "Spades", 11);
		Card card2 = new Card("King", "Spades", 13);
		Card card3 = new Card("Ace", "Spades", 14);
		
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
	}
}
