package ua.lviv.iot.algo.part1.lab1;

import junit.framework.TestCase;

public class ArtificialPreciousStoneTest extends TestCase {

    public void testGetFullPrice() {
        ArtificialPreciousStone stone = new ArtificialPreciousStone();
        stone.setGram(5);
        stone.setName("miwa");
        stone.setPricePerGram(100);
        stone.setColor("blue");
        assertEquals(500, stone.getFullPrice());
    }

    public void testTestToString() {
        ArtificialPreciousStone stone = new ArtificialPreciousStone("miwa", "blue", 5, 100);
        assertEquals("ArtificialPreciousStone(name=miwa, color=blue, gram=5, pricePerGram=100)",
                stone.toString());
    }
}