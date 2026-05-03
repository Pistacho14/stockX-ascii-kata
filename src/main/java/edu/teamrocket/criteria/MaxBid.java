package edu.teamrocket.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.item.Item;
import edu.teamrocket.item.Offer;


public class MaxBid implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item item) {
        
        List<Offer> bids = new ArrayList<>();
        int currentMaxBid = 0;

        for (Offer offer : item.offer()) {
            if (bids.isEmpty()) {
                bids.add(offer);
                currentMaxBid = offer.value();
            }
            else if (currentMaxBid < offer.value()) {
                bids.set(0, offer);
                currentMaxBid = offer.value();
            }
        }
        return bids;
    }
    
}
