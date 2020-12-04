package lr5;

import java.util.Random;

abstract public class Hand {
    protected Decks decks = new Deck(Boolean.FALSE);
    private final Random generator = new Random();

    abstract void decide(Decks filledDeck);

    protected void showCurrentHand(String className) {
        System.out.printf("%s's hand: %s\n", className, decks.tables);
    }

    protected void takeCard(Decks filledDeck) {
        int cardIndex = generator.nextInt(filledDeck.tables.size());

        decks.tables.add(filledDeck.tables.get(cardIndex));
        dropCard(filledDeck, cardIndex);
    }

    protected void dropCard(Decks filledDeck, int cardIndex) {
        filledDeck.tables.remove(cardIndex);
    }

    protected void init(String className, Decks filledDeck) {
        takeCard(filledDeck);
        takeCard(filledDeck);
    }

    protected int countPoints() {
        int sum = 0;
        for (int i = 0; i < decks.tables.size(); i++) {
            sum += decks.tables.get(i).cards.points;
        }
        return sum;
    }

    protected boolean checkOverflow(int border) {
        int points = countPoints();
        return points > border;
    }
}