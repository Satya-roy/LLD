package driver;

public class Driver {
    private final String name;
    private final int rating;
    private boolean available;

    public Driver(String _name, int _rating) {
        this.name = _name;
        this.rating = _rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public boolean isAvailable() {
        return available;
    }

    public void updateAvailability(boolean value) {
        this.available = value;
    }
}
