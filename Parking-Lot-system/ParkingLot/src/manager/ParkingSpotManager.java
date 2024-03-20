package manager;

import model.VehicleType;
import model.parkingSpot.ParkingSpot;
import model.vehicle.Vehicle;
import java.util.Map;

public class ParkingSpotManager {

    private volatile ParkingSpotManager parkingSpotManager;

    private ParkingSpotManager() {};

    public ParkingSpotManager getParkingSpotManager() {
        if(parkingSpotManager == null) {
            synchronized (ParkingSpotManager.class) {
                if(parkingSpotManager == null) {
                    parkingSpotManager = new ParkingSpotManager();
                }
            }
        }
        return parkingSpotManager;
    }

    //parking spot id -> true or false
    Map<ParkingSpot, Boolean> listOfParkingSpot;

    //LicenseNo. (Vehicle) -> ParkingSpot
    Map<Integer, ParkingSpot> listOfVehicleAndParkingSpot;

    public ParkingSpotManager(Map<ParkingSpot, Boolean> listOfParkingSpot,
                              Map<Integer, ParkingSpot> listOfVehicleAndParkingSpot) {
        this.listOfParkingSpot = listOfParkingSpot;
        this.listOfVehicleAndParkingSpot = listOfVehicleAndParkingSpot;
    }

    public boolean assignSpot(VehicleType type, Vehicle vehicle) {
        // ToDo - find parking spot on the basis of vehicle type and assign the spot

        return true;
    }

    public boolean removeVehicle(Vehicle vehicle) {
        Integer licenseNo = vehicle.getLicenseNumber();
        ParkingSpot parkingSpot = listOfVehicleAndParkingSpot.get(licenseNo);
        listOfParkingSpot.put(parkingSpot, false);
        return true;
    }
}
