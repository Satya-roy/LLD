package pricingStrategy;

import trip.TripMetaData;

public class DefaultPricingStrategy implements PricingStrategy{
    public double calculatePrice(TripMetaData metaData) {
        System.out.println("Default pricing strategy 180");
        return 180;
    }
}
