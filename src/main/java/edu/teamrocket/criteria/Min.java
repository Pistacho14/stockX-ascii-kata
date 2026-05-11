package edu.teamrocket.criteria;

import java.util.List;

import edu.teamrocket.item.Item;
import edu.teamrocket.item.Offer;

public class Min implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public Min(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {

        List<Offer> offers = criteria.checkCriteria(item);
        List<Offer> otherOffers = otherCriteria.checkCriteria(item);

        return offers.stream()
                .filter(otherOffers::contains)
                .min(Offer::compareTo)
                .map(List::of)
                .orElse(List.of());
    }
}
