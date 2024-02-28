package manager;

import driver.Driver;

import java.util.HashMap;
import java.util.Map;

/**
 * Driver manager is singleton class, using enum.
 */
public enum DriverManager {
    DRIVER_MANAGER_INSTANCE;
    private Map<String, Driver>  driversMap;
    DriverManager() {
        driversMap = new HashMap<>();
    }

    public void addDriver(Driver driver) {
        String name = driver.getName();
        driversMap.put(name, driver);
    }

    public Driver getDriver(String name) {
        return driversMap.get(name);
    }

    public Map<String, Driver> getDriversMap() {
        return driversMap;
    }
}
