package manager;

import Data.Driver;

import java.util.HashMap;
import java.util.Map;

public class DriverManager {
    private Map<String, Driver> drivers = new HashMap<>();
    public void addDriver(Driver driver) {
        drivers.put(driver.getName(), driver);
    }
    public void updateDriverAvailability(String driverId, boolean isAvailable) {
        if(drivers.containsKey(driverId)) {
            drivers.get(driverId).setAvailable(isAvailable);
        }
    }
}
