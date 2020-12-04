package lr5;

public class Run {
    public static void main(String[] args) {
        Init init = new Init();
        Hand player = new Player();
        Hand dealer = new Dealer();
        init.startGame(player);
        init.startGame(dealer);
        init.startGame();
    }
}
