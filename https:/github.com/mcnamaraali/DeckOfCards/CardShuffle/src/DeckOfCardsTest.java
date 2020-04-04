
public class DeckOfCardsTest {

	public static void main(String[] args) {
		DeckOfCards deckOfCards = new DeckOfCards();
		deckOfCards.shuffle();
		
		for (int counter = 1; counter <= 52; counter++) {
			System.out.printf("%-19s", deckOfCards.dealCard());
			
			if(counter % 4 == 0) {
				System.out.println();
			}
		}

	}

}
