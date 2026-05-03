package edu.teamrocket.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.item.Item;
import edu.teamrocket.item.Offer;


public class MinAsk implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item item) {
        
        List<Offer> bids = new ArrayList<>();
        int currentMinAsk = 0;

        for (Offer offer : item.offer()) {
            if (bids.isEmpty()) {
                bids.add(offer);
                currentMinAsk = offer.value();
            }
            else if (currentMinAsk > offer.value()) {
                bids.set(0, offer);
                currentMinAsk = offer.value();
            }
        }
        return bids;
    }
    
}