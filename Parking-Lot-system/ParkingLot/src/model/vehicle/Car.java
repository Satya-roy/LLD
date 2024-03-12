package model.vehicle;

public class Car extends Vehicle {
    public Car(int licenseNumber) {
        super(licenseNumber);
    }
    //ToDo : print the type of vehicle and parking ticket number
    public void assignTicket(String parkingTicket) {
        System.out.println("Parking Ticket No. " + parkingTicket);
    }
}
