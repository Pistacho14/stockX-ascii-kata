package edu.teamrocket.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.item.Ask;
import edu.teamrocket.item.Item;
import edu.teamrocket.item.Offer;


public class Asks implements Criteria {
    
    @Override
    public List<Offer> checkCriteria(Item item) {
        
        List<Offer> asks = new ArrayList<>();

        for (Offer offer : item.offer()) {
            if (offer instanceof Ask) {
                asks.add(offer);
            }
        }
        return asks;
    }
}
