package model.parkingSpot;

import model.vehicle.Vehicle;

public class Motorcycle extends ParkingSpot {
    public Motorcycle(int id) {
        super(id, false);
    }
    public ParkingSpotType getType() {
        return ParkingSpotType.MOTORCYCLE;
    }
}
