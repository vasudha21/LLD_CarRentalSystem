package strategy;

import Data.Driver;
import Data.Location;

import java.util.List;

public class StrategyManager {
    private DriverAllocationStrategy driverAllocationStrategy;
    private PricingStrategy pricingStrategy;

    public StrategyManager(PricingStrategy pricingStrategy, DriverAllocationStrategy driverAllocationStrategy) {
        this.pricingStrategy = pricingStrategy;
        this.driverAllocationStrategy = driverAllocationStrategy;
    }

    public void setDriverAllocationStrategy(DriverAllocationStrategy driverAllocationStrategy) {
        this.driverAllocationStrategy = driverAllocationStrategy;
    }
    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
    public Driver allocateDriver(List<Driver> driver, Location pickUpLocation){
        return driverAllocationStrategy.allocateDriver(driver, pickUpLocation);
    }

    public double calculatePrice(Location pickUpLocation, Location dropLocation, double basePrice){
        return pricingStrategy.calculatePrice(pickUpLocation, dropLocation, basePrice);
    }
}
