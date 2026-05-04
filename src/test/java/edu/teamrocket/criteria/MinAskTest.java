package edu.teamrocket.criteria;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.teamrocket.item.Bid;
import edu.teamrocket.item.Item;
import edu.teamrocket.item.Offer;
import edu.teamrocket.item.Sneaker;


class MinAskTest {

    @Test
    void MaxBidTest() {
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Bid("13", 550));
        sneaker.add(new Bid("13", 650));
        sneaker.add(new Bid("9.5", 449));
        sneaker.add(new Bid("9.5", 459)); 
        sneaker.add(new Bid("9.5", 469)); 
        sneaker.add(new Bid("9.5", 489)); 
        sneaker.add(new Bid("9.5", 499)); 

        List<Offer> minAsk = new MaxBid().checkCriteria(sneaker);

        assertEquals(650, minAsk.get(0).value());
    }

}
