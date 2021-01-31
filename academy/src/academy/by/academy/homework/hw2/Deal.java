package academy.by.academy.homework.hw2;

import java.util.Random;
import java.util.Scanner;

public class Deal {
	final static int NUMBER_OF_CARD = 5; // number of card

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		PlayingCards playingCards = new PlayingCards();
		int numberOfPlayers = 0;

		// init number of players
		System.out.print("Insert number of players (n <= 10) n = ");
		while (true) {
			numberOfPlayers = scanner.nextInt();

			if (numberOfPlayers > 0 && numberOfPlayers < 11) { // number of players 0 < n <= 10
				scanner.close();
				break;
			} else {
				System.out.print("Oooops....Insert number of players (0 < n <= 10) n = ");
			}
		}

		// init deck
		PlayingCards[] arrayCards = playingCards.initPlayCards(); // init card deck

		// poker cards deal
		PlayingCards[] dealCards = new PlayingCards[arrayCards.length]; // array deal of card
		int count = 0; // number of deal of card
		boolean flag = true; // deal card true or false

		System.out.println("Poker card deal!!!");
		for (int i = 0; i < numberOfPlayers; i++) {
			System.out.print((i + 1) + " player: ");
			for (int j = 0; j < NUMBER_OF_CARD; j++) {
				playingCards = arrayCards[random.nextInt(arrayCards.length)];

				for (int k = 0; k < count; k++) {
					if (playingCards.equals(dealCards[k])) {
						j--;
						flag = false;
						break;
					}
				}
				if (flag) {
					dealCards[count++] = playingCards;
					System.out.print(playingCards + " ");
				}
				flag = true;

			}
			System.out.println("\n");
		}

	}
}
