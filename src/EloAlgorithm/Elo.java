package EloAlgorithm;

public class Elo {

    private static double Probability(People playerRating1, People playerRating2) {
        return 1 / (1 + 1.0f * (Math.pow(10, 1.0f *
                        (playerRating1.getRating() - playerRating2.getRating()) / 400)));
    }

    static void EloRating(People player1, People player2, int K) {

        double winningProbabilityPlayer1 = Probability(player1, player2);
        double winningProbabilityPlayer2 = Probability(player2, player1);

        if (player1.isWinner()){
            player1.setRating(player1.getRating() + K * (1 - winningProbabilityPlayer2));
            player2.setRating(player2.getRating() + K * (0 - winningProbabilityPlayer1));

            System.out.println(player1);
            System.out.println(player2);

            return;
        }

        player1.setRating(player1.getRating() + K * (0 - winningProbabilityPlayer2));
        player2.setRating(player2.getRating() + K * (1 - winningProbabilityPlayer1));

        System.out.println(player1);
        System.out.println(player2);
    }

}
