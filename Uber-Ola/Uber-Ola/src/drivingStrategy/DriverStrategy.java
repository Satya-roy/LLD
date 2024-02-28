package drivingStrategy;

import driver.Driver;
import trip.TripMetaData;

public interface DriverStrategy {
    Driver matchDriver(TripMetaData metaData);

}
