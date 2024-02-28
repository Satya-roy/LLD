import driver.Driver;
import manager.DriverManager;
import manager.RiderManager;
import manager.TripManager;
import rider.Rider;
import trip.Trip;

import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Create Riders and Drivers, rating is b/w 1 to 5
         */

        Rider rider_1 = new Rider("Satya", 2);
        Rider rider_2 = new Rider("Arpit", 4);

        RiderManager riderManager = RiderManager.getRiderManagerInstance();
        riderManager.addRider(rider_1);
        riderManager.addRider(rider_2);

        Driver driver_1 = new Driver("Ashok", 2);
        Driver driver_2 = new Driver("Vikram", 3);
        DriverManager driverManager = DriverManager.DRIVER_MANAGER_INSTANCE;
        driverManager.addDriver(driver_1);
        driverManager.addDriver(driver_2);

        TripManager tripManager = TripManager.getTripManagerInstance();
        System.out.println("Creating trip for Satya from Ittina Akkala to LMNT");
        tripManager.createTrip(rider_1, "Ittina Akkala", "LMNT");

        Map<Integer, Trip> tripMap = tripManager.getTripsInfo();
        for(Map.Entry<Integer, Trip> entry : tripMap.entrySet()) {
            entry.getValue().displayTripDetails();
        }
    }
}