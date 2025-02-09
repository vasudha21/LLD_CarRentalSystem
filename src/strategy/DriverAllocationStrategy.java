package strategy;

import Data.Driver;
import Data.Location;

import java.util.List;

public interface DriverAllocationStrategy {
    Driver allocateDriver(List<Driver> availableDriver, Location pickUpLocation);
}
