package lr5;

public class Table {
    public Suits suits;
    public Cards cards;

    public Table(Suits suits, Cards cards) {
        this.suits = suits;
        this.cards = cards;
    }

    @Override
    public String toString() {
        return cards.name + "" + suits;
    }
}
