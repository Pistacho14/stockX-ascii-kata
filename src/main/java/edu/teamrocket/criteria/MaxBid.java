package edu.teamrocket.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.item.Item;
import edu.teamrocket.item.Offer;
import edu.teamrocket.item.Bid;


public class MaxBid implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item item) {
        
        List<Offer> bids = new ArrayList<>();
        int currentMaxBid = 0;

        for (Offer offer : item.offers()) {
            if (bids.isEmpty()) {
                bids.add(offer);
                currentMaxBid = offer.value();
            }
            else if (currentMaxBid < offer.value() && offer instanceof Bid) {
                bids.set(0, offer);
                currentMaxBid = offer.value();
            }
        }
        return bids;
    }
    
}
