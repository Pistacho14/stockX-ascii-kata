package edu.teamrocket.criteria;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.teamrocket.item.*;

class AndCriteriaTest {
    
    @Test
    void andCriteriaTest() {
        Criteria size = new Size("9.5");
        Criteria sales = new Sales();
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Bid("13", 550));
        sneaker.add(new Ask("13", 650));
        sneaker.add(new Sale("9.5", 479));

        List<Offer> saleList = new AndCriteria(size, sales).checkCriteria(sneaker);

        assertEquals(479, saleList.getFirst().value());
    }
}
