package edu.teamrocket;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.teamrocket.criteria.MaxBid;
import edu.teamrocket.item.Bid;
import edu.teamrocket.item.Item;
import edu.teamrocket.item.Offer;
import edu.teamrocket.item.Sneaker;


class MaxBidTest {

    @Test
    void MaxBidTest() {
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Bid("13", 550));
        sneaker.add(new Bid("13", 650));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Bid("9.5", 479)); 
        sneaker.add(new Bid("9.5", 479)); 
        sneaker.add(new Bid("9.5", 489)); 
        sneaker.add(new Bid("9.5", 499)); 

        List<Offer> maxBid = new MaxBid().checkCriteria(sneaker);

        assertEquals(650, maxBid.get(0).value());
    }

}
