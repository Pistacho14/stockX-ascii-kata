package edu.teamrocket.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.item.Item;
import edu.teamrocket.item.Offer;
import edu.teamrocket.item.Ask;


public class MinAsk implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item item) {
        
        List<Offer> bids = new ArrayList<>();
        int currentMinAsk = 0;

        for (Offer offer : item.offers()) {
            if (bids.isEmpty()) {
                bids.add(offer);
                currentMinAsk = offer.value();
            }
            else if (currentMinAsk > offer.value() && offer instanceof Ask) {
                bids.set(0, offer);
                currentMinAsk = offer.value();
            }
        }
        return bids;
    }
    
}