package academy.by.academy.homework.hw2;

public class PlayingCards {
	public static int NUMBER_OF_CARDS = 52; // 52 cards in deck
	static String[] arraysSuit; // array suit
	static String[] arrayNominal; // array nominal
	private String suit; // suit card
	private String nominal; // nominal card

	// initialising arraySuit and arrayNominal
	static {
		arraysSuit = new String[] { "Diamonds", "Hearts", "Spades", "Clubs" };
		arrayNominal = new String[] { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King", "Ace" };
	}

	public PlayingCards() {
		super();
	}

	public PlayingCards(String suit, String nominal) {
		super();
		this.suit = suit;
		this.nominal = nominal;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getNominal() {
		return nominal;
	}

	public void setNominal(String nominal) {
		this.nominal = nominal;
	}

	// init card deck and return array of playing card deck
	public PlayingCards[] initPlayCards() {
		PlayingCards[] playCards = new PlayingCards[NUMBER_OF_CARDS];
		int count = 0;

		while (count < NUMBER_OF_CARDS) {
			for (int i = 0; i < arraysSuit.length; i++) {
				for (int j = 0; j < arrayNominal.length; j++) {
					playCards[count++] = new PlayingCards(arraysSuit[i], arrayNominal[j]);
				}
			}
		}

		return playCards;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\"" + getSuit() + " " + getNominal() + "\"";
	}
}
