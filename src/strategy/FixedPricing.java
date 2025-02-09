package strategy;

import Data.Location;

public class FixedPricing implements PricingStrategy {

    @Override
    public double calculatePrice(Location pickUpLocation, Location dropOffLocation, double basePrice) {
        return basePrice;
    }
}
