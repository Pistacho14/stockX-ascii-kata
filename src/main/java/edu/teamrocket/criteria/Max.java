package edu.teamrocket.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.item.Item;
import edu.teamrocket.item.Offer;

public class Max implements Criteria{
    
    private Criteria criteria;
    private Criteria otherCriteria;

    public Max(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {

        List<Offer> offers = new ArrayList<>();
        int currentMaxBid = 0;
        for (Offer offer : item.offers()) {
            if (offer.getClass() == otherCriteria.getClass() && offer.size().equals(criteria.checkCriteria(item).getFirst().size())) {
                if (offer.value() > currentMaxBid) {
                    offers.addFirst(offer);
                } else {
                    offers.add(offer);
                }
            }
        }
        return offers;
    }
}
