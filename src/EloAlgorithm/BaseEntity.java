package EloAlgorithm;

public abstract class BaseEntity {

    private Integer id;

    public BaseEntity(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
