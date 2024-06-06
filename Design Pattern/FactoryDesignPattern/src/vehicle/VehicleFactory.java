package vehicle;

public class VehicleFactory {
    private VehicleFactory() {};
    public static Vehicle getVehicle(String name) {
        return switch (name) {
            case "BMW" -> new BMW();
            case "HYUNDAI" -> new Hyundai();
            case "TATA" -> new Tata();
            default -> null;
        };
    }
}
