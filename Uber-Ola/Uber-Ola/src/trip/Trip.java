package trip;

import driver.Driver;
import drivingStrategy.DriverStrategy;
import pricingStrategy.PricingStrategy;
import rider.Rider;

public class Trip {
    static int tripId = 0;
    private Rider rider;
    private Driver driver;
    private String srcLoc;
    private String destLoc;
    private String status;
    private double price;
    private PricingStrategy pricingStrategy;
    private DriverStrategy driverStrategy;

    public Trip(Rider rider,
                Driver driver,
                String srcLoc,
                String destLoc,
                String status,
                double price,
                PricingStrategy pricingStrategy,
                DriverStrategy driverStrategy) {
        this.rider = rider;
        this.driver = driver;
        this.srcLoc = srcLoc;
        this.destLoc =destLoc;
        this.status = status;
        this.price = price;
        this.pricingStrategy = pricingStrategy;
        this.driverStrategy = driverStrategy;
        tripId++;
    }

    public int getTripId() {
        return tripId;
    }

    public void displayTripDetails() {
        System.out.println();
        System.out.println("Trip Id - " + tripId);
        System.out.println("Rider - " + rider.getName());
        System.out.println("Driver - " + driver.getName());
        System.out.println("Price - " + price);
        System.out.println("src location " + srcLoc + "dest location " + destLoc);
    }
}
