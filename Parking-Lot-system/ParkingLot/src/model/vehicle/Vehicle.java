package model.vehicle;

public abstract class Vehicle {
    private int licenseNumber;

    public Vehicle(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    //ToDo - Update String to ParkingTicket class
    public abstract void assignTicket(String ticket);
}
