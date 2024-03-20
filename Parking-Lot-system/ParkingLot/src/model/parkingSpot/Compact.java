package model.parkingSpot;

import model.vehicle.Vehicle;

public class Compact extends ParkingSpot {
    public Compact(int id) {
        super(id, false);
    }

    public ParkingSpotType getType() {
        return ParkingSpotType.COMPACT;
    }
}
