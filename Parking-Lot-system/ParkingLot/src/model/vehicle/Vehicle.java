package model.vehicle;

public abstract class Vehicle {
    private final int licenseNumber;

    public Vehicle(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    //ToDo - Update String to ParkingTicket class
    public abstract void assignTicket(String ticket);
}
