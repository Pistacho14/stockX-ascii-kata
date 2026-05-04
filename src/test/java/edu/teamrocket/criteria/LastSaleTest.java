package edu.teamrocket.criteria;


import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.teamrocket.item.*;

class LastSaleTest {
    
    @Test
    void lastSaleTest() {
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Sale("13", 550));
        sneaker.add(new Ask("13", 650));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Sale("15", 525));
        sneaker.add(new Sale("8", 600));
        sneaker.add(new Sale("4", 450));

        List<Offer> lastSale = new LastSale().checkCriteria(sneaker);

        assertEquals(450, lastSale.getFirst().value());
    }
}
