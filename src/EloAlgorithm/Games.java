package EloAlgorithm;

public class Games extends BaseEntity{

    private String type;

    public Games(Integer id, String type) {
        super(id);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Game id: %d, type: %s", this.getId(), this.getType());
    }
}
