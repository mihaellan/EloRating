package EloAlgorithm;

public class People extends BaseEntity{

    private String firstName;
    private String lastName;
    private double rating;
    public boolean isWinner;
    private Games game;

    public People(Integer id, String firstName, String lastName, double rating, boolean isWinner, Games game) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
        this.isWinner = isWinner;
        this.game = game;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Games getGame() {
        return game;
    }

    public void setGame(Games game) {
        this.game = game;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    @Override
    public String toString() {
        return String.format("Player: %s %s with id: %d, plays %s and his rating is: %.2f ", this.getFirstName(), this.getLastName(),
                this.getId(), this.getGame().getType(), this.getRating());
    }
}
