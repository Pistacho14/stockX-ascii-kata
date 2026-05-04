package edu.teamrocket.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.item.Item;
import edu.teamrocket.item.Offer;
import edu.teamrocket.item.Sale;

public class LastSale implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item item) {

        List<Offer> sales = new ArrayList<>();

        for (Offer offer : item.offers()) {
            if (offer instanceof Sale) {
                sales.addFirst(offer);
            }
        }
        return sales;
    }
}
