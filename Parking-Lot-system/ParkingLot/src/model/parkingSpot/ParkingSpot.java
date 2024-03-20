package model.parkingSpot;

import model.vehicle.Vehicle;

public abstract class ParkingSpot {
    int id;
    boolean isFree;
    Vehicle vehicle;

    public ParkingSpot(int id,
                       boolean isFree) {
        this.id = id;
        this.isFree = isFree;
    }

    public abstract ParkingSpotType getType();
}
