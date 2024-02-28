package pricingStrategy;

import trip.TripMetaData;

public interface PricingStrategy {
    double calculatePrice(TripMetaData metaData);
}
