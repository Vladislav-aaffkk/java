package lr5;

public class Deck extends Decks {
    public Deck(Boolean isFilled) {
        if (isFilled) {
            for (Suits suit: Suits.values()) {
                for (Cards card: Cards.values()) {
                    tables.add(new Table(suit, card));
                }
            }
        }
    }

}
