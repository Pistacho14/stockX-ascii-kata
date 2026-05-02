package edu.teamrocket.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.item.Offer;
import edu.teamrocket.item.Item;


public class Bids implements Criteria {
    
    @Override
    public List<Offer> checkCriteria(Item item) {
        
        List<Offer> bids = new ArrayList<>();

        for (Offer offer : bids) {
            if (Offer.class.isInstance(offer)) {
                bids.add(offer);
            }
        }
        return bids;
    }
}
