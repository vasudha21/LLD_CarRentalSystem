package manager;

import Data.Rider;

import java.util.HashMap;
import java.util.Map;

public class RiderManager {
    private Map<String, Rider> riders = new HashMap<>();
    public Rider getRider(String id) {
        return riders.get(id);
    }
}
