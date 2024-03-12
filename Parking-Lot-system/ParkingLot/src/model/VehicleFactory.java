package model;

import model.vehicle.*;

public class VehicleFactory {
    private VehicleFactory() {};

    public static Vehicle getVechile(VehicleType type, int licenseNo) {
        return switch(type) {
            case CAR -> new Car(licenseNo);
            case VAN -> new Van(licenseNo);
            case TRUCK -> new Truck(licenseNo);
            case MOTORCYCLE -> new Motorcycle(licenseNo);
        };
    }
}
