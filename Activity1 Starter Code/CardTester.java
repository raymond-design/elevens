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
		Card a = new Card("2","Spades",2); 
		Card b = new Card("9","Clubs",2); 
		Card c = new Card("Queen","Diamonds",2); 
		if(!a.matches(b))
		{
		    System.out.println("209");
		  }
		  else
		  {
		    System.out.println("dss");   
        }
        System.out.println(a.toString());
	}
}
