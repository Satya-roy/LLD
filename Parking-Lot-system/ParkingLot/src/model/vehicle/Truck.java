package model.vehicle;

public class Truck extends Vehicle {
    public Truck(int licenseNo) {
        super(licenseNo);
    }

    @Override
    public void assignTicket(String ticket) {
        System.out.println("Parking Ticket No. " + ticket);
    }
}
