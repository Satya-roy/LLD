package rider;

public class Rider {
    private final String name;
    private final int rating;

    public Rider(String _name, int _rating) {
        this.name = _name;
        this.rating = _rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }
}
