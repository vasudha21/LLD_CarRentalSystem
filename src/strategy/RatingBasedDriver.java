package strategy;

import Data.Driver;
import Data.Location;

import java.util.List;

public class RatingBasedDriver implements DriverAllocationStrategy {
    @Override
    public Driver allocateDriver(List<Driver> availableDriver, Location pickUpLocation) {
        return availableDriver.stream()
                .filter(Driver::isAvailable)
                .findFirst()
                .orElse(null);
    }
}
