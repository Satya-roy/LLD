package model.vehicle;

public class Van extends Vehicle {
    public Van(int licenseNo) {
        super(licenseNo);
    }

    @Override
    public void assignTicket(String ticket) {
        System.out.println("Parking Ticket No. " + ticket);
    }
}
