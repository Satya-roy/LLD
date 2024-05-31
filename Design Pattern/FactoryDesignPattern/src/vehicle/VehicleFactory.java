package vehicle;

public class VehicleFactory {
    public Vehicle getVehicle(String name) {
        return switch (name) {
            case "BMW" -> new BMW();
            case "HYUNDAI" -> new Hyundai();
            case "TATA" -> new Tata();
            default -> null;
        };
    }
}
