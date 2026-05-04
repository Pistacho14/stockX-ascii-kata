package edu.teamrocket.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.item.Item;
import edu.teamrocket.item.Offer;

public class Size implements Criteria{

    private String size;

    public Size(String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {

        List<Offer> sizeOffers = new ArrayList<>();
        for (Offer offer : item.offers()) {
            if (offer.size().equals(this.size)) {
                sizeOffers.add(offer);
            }
        }
        return sizeOffers;
    }
}
