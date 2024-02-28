package trip;

public class TripMetaData {
    String srcLocation;
    String dstLocation;
    int riderRating;
    int driverRating;

    public TripMetaData(String srcLocation,
                        String dstLocation,
                        int riderRating) {
        this.srcLocation = srcLocation;
        this.dstLocation = dstLocation;
        this.riderRating = riderRating;
    }

    public int getRiderRating() {
        return riderRating;
    }

    public int getDriverRating() {
        return driverRating;
    }

    public String getSrcLocation() {
        return srcLocation;
    }

    public String getDstLocation() {
        return dstLocation;
    }

    public void setDriverRating(int driverRating) {
        this.driverRating = driverRating;
    }
}
