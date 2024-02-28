package drivingStrategy;

import driver.Driver;
import manager.DriverManager;
import trip.TripMetaData;

public class LeastTImeBasedMatchingStrategy implements DriverStrategy{
    public Driver matchDriver(TripMetaData tripMetaData) {
        DriverManager driverManager = DriverManager.DRIVER_MANAGER_INSTANCE;

        if(driverManager.getDriversMap().isEmpty()) {
            System.out.println("No drivers! What service is this huh?");
        }

        System.out.println("using quadtree to see the nearest cab, using driver manager to get details of driver");

        Driver driver = driverManager.getDriversMap()
                .entrySet()
                .iterator()
                .next()
                .getValue();

        tripMetaData.setDriverRating(driver.getRating());
        return driver;
    }
}
