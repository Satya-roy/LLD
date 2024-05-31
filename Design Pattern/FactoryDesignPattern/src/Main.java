import vehicle.Vehicle;
import vehicle.VehicleFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle v1 = vehicleFactory.getVehicle("BMW");
        v1.draw();
    }
}