package pricingStrategy;

import trip.TripMetaData;

public class RatingBasedPricingStrategy implements PricingStrategy{
    public double calculatePrice(TripMetaData metaData) {
        System.out.println("Rating based pricing strategy ");
        if(metaData.getDriverRating() > 3) {
            return 65.0;
        }
        return 55.0;
    }
}
