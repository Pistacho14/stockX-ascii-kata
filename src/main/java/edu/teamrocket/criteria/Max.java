package edu.teamrocket.criteria;

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

        List<Offer> offers = criteria.checkCriteria(item);
        List<Offer> otherOffers = otherCriteria.checkCriteria(item);

        return offers.stream()
                .filter(otherOffers::contains)
                .max(Offer::compareTo)
                .map(List::of)
                .orElse(List.of());
    }
}
