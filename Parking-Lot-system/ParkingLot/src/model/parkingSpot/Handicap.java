package model.parkingSpot;

import model.vehicle.Vehicle;

public class Handicap extends ParkingSpot{
    public Handicap(int id) {
        super(id, true);
    }

    public ParkingSpotType getType() {
        return ParkingSpotType.HANDICAP;
    }
}
