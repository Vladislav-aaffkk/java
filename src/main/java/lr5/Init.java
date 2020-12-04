package lr5;

import java.util.ArrayList;
import java.util.List;

public class Init {
    List<Hand> list = new ArrayList<>();
    Decks filledDeck = new Deck(Boolean.TRUE);

    public void startGame(Hand hand) {
        list.add(hand);
    }

    public void getUpFromTheTable(Hand hand) {
        list.remove(hand);
    }

    public void startGame() {
        list.forEach(item -> item.init(item.getClass().getSimpleName(), filledDeck));
        showHand();
        handDecide();
    }

    public void showHand() {
        list.forEach(item -> {
            if (item instanceof Player) {
                item.showCurrentHand(item.getClass().getSimpleName());
            }
        });
    }

    public void handDecide() {
        list.forEach(item -> item.decide(filledDeck));
        getGameResult();
    }

    public void getGameResult() {
        System.out.println("Score:\n");
        list.forEach(item -> {
            item.showCurrentHand(item.getClass().getSimpleName());
            System.out.printf("%s's score: %d\n", item.getClass().getSimpleName(), item.countPoints());
        });
    }
}
