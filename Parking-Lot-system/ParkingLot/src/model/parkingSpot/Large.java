package model.parkingSpot;

import model.vehicle.Vehicle;

public class Large extends ParkingSpot {
    public Large(int id,
                 boolean isFree) {
        super(id, false);
    }

    public ParkingSpotType getType() {
        return ParkingSpotType.LARGE;
    }
}
