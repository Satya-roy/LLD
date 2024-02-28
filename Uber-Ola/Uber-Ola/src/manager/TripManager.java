package manager;

import driver.Driver;
import drivingStrategy.DriverStrategy;
import pricingStrategy.PricingStrategy;
import rider.Rider;
import trip.Trip;
import trip.TripMetaData;

import java.util.HashMap;
import java.util.Map;

/**
 *  Singleton TripManager using double-checked lock
 */
public class TripManager {
    private static volatile TripManager tripManagerInstance;

    private RiderManager riderManager;
    private DriverManager driverManager;
    Map<Integer, TripMetaData> tripsMetaDataMap;
    Map<Integer, Trip> tripsInfo;

    private TripManager() {
        tripsInfo = new HashMap<>();
        tripsMetaDataMap = new HashMap<>();
        riderManager = RiderManager.getRiderManagerInstance();
        driverManager = DriverManager.DRIVER_MANAGER_INSTANCE;
    }

    public static TripManager getTripManagerInstance() {
        if(tripManagerInstance == null) {
            synchronized (TripManager.class) {
                if(tripManagerInstance == null) {
                    tripManagerInstance = new TripManager();
                }
            }
        }
        return tripManagerInstance;
    }

    public void createTrip(Rider rider, String srcLoc, String dstLoc) {
        TripMetaData metaData = new TripMetaData(srcLoc, dstLoc, rider.getRating());
        StrategyManager strategyManager = StrategyManager.getStrategyManagerInstance();
        PricingStrategy pricingStrategy = strategyManager.determinePricingStrategy(metaData);
        DriverStrategy driverMatchingStrategy = strategyManager.determineDriverMatchingStrategy(metaData);

        Driver driver = driverMatchingStrategy.matchDriver(metaData);
        double tripPrice = pricingStrategy.calculatePrice(metaData);

        Trip trip = new Trip(rider, driver, srcLoc, dstLoc, "booked" ,tripPrice, pricingStrategy, driverMatchingStrategy);
        tripsInfo.put(trip.getTripId(), trip);
        tripsMetaDataMap.put(trip.getTripId(), metaData);
    }

    public Map<Integer, Trip> getTripsInfo() {
        return tripsInfo;
    }
}
