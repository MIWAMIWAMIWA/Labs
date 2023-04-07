package ua.lviv.iot.algo.part1.lab1;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class ExplodingStoneTest extends TestCase {
    @Test
    public void testGetFullPrice() {
        ExplodingStone stone = new ExplodingStone();
        stone.setAmount(3);
        stone.setName("miwa");
        stone.setColor("dark");
        stone.setPricePerAmount(100);
        assertEquals(300, stone.getFullPrice());

    }

    @Test
    public void testTestToString() {
        ExplodingStone stone = new ExplodingStone("miwa", "dark", 3, 100);
        assertEquals("ExplodingStone(name=miwa, color=dark, amount=3, pricePerAmount=100)", stone.toString());
    }


}