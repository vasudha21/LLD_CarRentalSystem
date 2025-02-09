package manager;

import Data.Driver;
import Data.Location;
import Data.Rider;
import Data.Trip;
import strategy.DriverAllocationStrategy;
import strategy.PricingStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TripManager {
    private Map<String, Trip> activeTrips;
    private DriverAllocationStrategy driverAllocationStrategy;
    private PricingStrategy pricingStrategy;

    public TripManager(DriverAllocationStrategy driverAllocationStrategy, PricingStrategy pricingStrategy) {
        this.activeTrips = new HashMap<>();
        this.driverAllocationStrategy = driverAllocationStrategy;
        this.pricingStrategy = pricingStrategy;
    }

    public Trip createTrip(String tripId, Rider rider, List<Driver> availableDrivers, Location dropLocation){
        Driver assignedDriver = driverAllocationStrategy.allocateDriver(availableDrivers, rider.getLocation());
        if(assignedDriver==null){
            System.out.println("no driver available");
            return null;
        }

        Trip newTrip = new Trip(tripId, rider, assignedDriver, rider.getLocation(), dropLocation);
        activeTrips.put(tripId, newTrip);
        System.out.println("trip is started with driver "+ assignedDriver.getName() + "for rider "+rider.getName());

        double calculatePrice = pricingStrategy.calculatePrice(newTrip.getPickupLocation(), newTrip.getDropOffLocation(), 50);
        System.out.println("estimated price "+calculatePrice);
        return newTrip;
    }

    public void completeTrip(String tripId){
        Trip trip = activeTrips.get(tripId);
        if(trip==null){
            System.out.println("trip not found");
            return;
        }
        trip.completeTrip();
        activeTrips.remove(tripId);
        System.out.println("trip is completed");
    }
}
