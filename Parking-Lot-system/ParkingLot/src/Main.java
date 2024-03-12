import model.VehicleFactory;
import model.VehicleType;
import model.vehicle.Car;
import model.vehicle.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Parking lot system");

        Vehicle car = VehicleFactory.getVechile(VehicleType.CAR, 4408);
        
    }
}