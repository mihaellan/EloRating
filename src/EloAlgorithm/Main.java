package EloAlgorithm;

public class Main {

    private final static int k = 10;

    public static void main(String[] args) {

        Games football  = new Games(1, "Football");

        People player1 = new People(1, "Ivan", "Petrov", 1200, true,  football);
        People player2 = new People(2, "Georgi", "Ivanov", 1000, false, football);

        Elo.EloRating(player1, player2, k);

        player1.setWinner(false);
        player2.setWinner(true);

        Elo.EloRating(player1, player2, k);
    }
}
