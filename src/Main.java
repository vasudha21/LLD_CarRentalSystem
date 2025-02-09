import Data.Driver;
import Data.Location;
import Data.Rider;
import Data.Trip;
import manager.TripManager;
import strategy.DriverAllocationStrategy;
import strategy.FixedPricing;
import strategy.NearestDriver;
import strategy.PricingStrategy;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("D1", "rocky",  new Location(15.78, 21.34), true, 4.5);
        Driver driver2 = new Driver("D2", "Sam", new Location(21.43, 33.21), true, 4.7);
        List<Driver> availableDrivers = Arrays.asList(driver, driver2);

        Rider rider1 = new Rider("R1", "Alex", new Location(42.21, 12.21));

        DriverAllocationStrategy allocationStrategy = new NearestDriver();
        PricingStrategy pricingStrategy = new FixedPricing();
        TripManager tripManager = new TripManager(allocationStrategy, pricingStrategy);

        Location dropLocation = new Location(56.11, 11.56);
        Trip trip = tripManager.createTrip("t1", rider1, availableDrivers, dropLocation);
        tripManager.completeTrip("t1");
    }
}