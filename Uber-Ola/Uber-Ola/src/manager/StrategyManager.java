package manager;

import drivingStrategy.DriverStrategy;
import drivingStrategy.LeastTImeBasedMatchingStrategy;
import pricingStrategy.PricingStrategy;
import pricingStrategy.RatingBasedPricingStrategy;
import trip.TripMetaData;

/**
 * Create strategy Manager as singleton using double-checked locking
 */

public class StrategyManager {
    private static volatile StrategyManager strategyManagerInstance;
    private StrategyManager() {}

    public StrategyManager getStrategyManagerInstance() {
        if(strategyManagerInstance == null) {
            synchronized (StrategyManager.class) {
                if(strategyManagerInstance == null) {
                    strategyManagerInstance = new StrategyManager();
                }
            }
        }
        return strategyManagerInstance;
    }

    PricingStrategy determinePricingStrategy(TripMetaData metaData) {
        // TODO : logic to decide pricing strategy using TripMetaData
        System.out.println("Based on location and other factors, setting up pricing strategy");
        return new RatingBasedPricingStrategy();
    }

    DriverStrategy determineDriverMatchingStrategy(TripMetaData metaData) {
        // TODO : logic to decide driver strategy using tripMetaData
        System.out.println("Based on location and other factors, setting driver matching strategy");
        return new LeastTImeBasedMatchingStrategy();
    }
}
