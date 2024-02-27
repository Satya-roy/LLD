package manager;

import driver.Driver;

import java.util.HashMap;
import java.util.Map;

/**
 * Driver manager is singleton class, using enum.
 */
public enum DiverManager {
    DRIVER_MANAGER_INSTANCE;
    private Map<String, Driver>  driversMap;
    private DiverManager() {
        driversMap = new HashMap<>();
    }

    public void addDriver(Driver driver) {
        String name = driver.getName();
        driversMap.put(name, driver);
    }

    public Driver getDriver(String name) {
        return driversMap.get(name);
    }
}
