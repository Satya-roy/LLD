import model.VehicleFactory;
import model.VehicleType;
import model.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Parking lot system");

        Vehicle car = VehicleFactory.getVechile(VehicleType.CAR, 4408);
        
    }
}