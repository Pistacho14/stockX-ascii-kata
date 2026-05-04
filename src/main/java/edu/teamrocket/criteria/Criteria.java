package edu.teamrocket.criteria;

import java.util.List;

import edu.teamrocket.item.Offer;
import edu.teamrocket.item.Item;

public interface Criteria {

    public List<Offer> checkCriteria(Item item);
}
