package strategy;

import Data.Location;

public interface PricingStrategy {
    double calculatePrice(Location pickUpLocation, Location dropOffLocation, double basePrice);
}
