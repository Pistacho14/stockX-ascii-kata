package edu.teamrocket.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.item.Item;
import edu.teamrocket.item.Offer;
import edu.teamrocket.item.Sale;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {

        List<Offer> offers = new ArrayList<>();
        for (Offer offer : item.offers()) {
            if (offer.getClass() == otherCriteria.getClass() && offer.size().equals(criteria.checkCriteria(item).getFirst().size())) {
                offers.add(offer);
            }
        }
        return offers;
    }
}
