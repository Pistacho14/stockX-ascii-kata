package edu.teamrocket.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.item.Bid;
import edu.teamrocket.item.Item;
import edu.teamrocket.item.Offer;


public class Bids implements Criteria {
    
    @Override
    public List<Offer> checkCriteria(Item item) {
        
        List<Offer> bids = new ArrayList<>();

        for (Offer offer : item.offers()) {
            if (offer instanceof Bid) {
                bids.add(offer);
            }
        }
        return bids;
    }
}
