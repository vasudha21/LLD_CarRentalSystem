package strategy;

import Data.Location;

public class RatingBasedPricing implements PricingStrategy {

    @Override
    public double calculatePrice(Location pickUpLocation, Location dropOffLocation, double basePrice) {
        return basePrice;
    }
}
