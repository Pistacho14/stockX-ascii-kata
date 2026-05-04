package edu.teamrocket.criteria;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.teamrocket.item.Ask;
import edu.teamrocket.item.Bid;
import edu.teamrocket.item.Item;
import edu.teamrocket.item.Offer;
import edu.teamrocket.item.Sneaker;

class AsksTest {

    @Test
    void asksTest() {
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Bid("13", 550));
        sneaker.add(new Ask("13", 650));
        sneaker.add(new Bid("9.5", 479));

        List<Offer> asks = new Asks().checkCriteria(sneaker);

        assertEquals(1, asks.size());
    }
}
