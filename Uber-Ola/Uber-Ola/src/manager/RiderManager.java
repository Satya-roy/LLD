package manager;

import rider.Rider;

import java.util.HashMap;
import java.util.Map;

/**
 * Rider manager is a singleton class, using double-checked locking. Alternative use enum class.
 */
public class RiderManager {
    private static volatile RiderManager riderManagerInstance;
    private Map<String, Rider> ridersMap;

    // make the constructor private
    private RiderManager() {
        this.ridersMap = new HashMap<>();
    };

    public RiderManager getRiderManagerInstance() {
        if(riderManagerInstance == null) { // to avoid threads to take synchronised block after 1st initialisation
            synchronized (RiderManager.class) {
                if(riderManagerInstance == null) { // create instance only once
                    riderManagerInstance = new RiderManager();
                }
            }
        }
        return riderManagerInstance;
    }

    public void addRider(Rider rider) {
        String name = rider.getName();
        // TO-DO : throw exception if name already exist
        ridersMap.put(name, rider);
    }

    public Rider getRider(String name) {
        // TO-DO : throw exception if name not found
        return ridersMap.get(name);
    }
}
