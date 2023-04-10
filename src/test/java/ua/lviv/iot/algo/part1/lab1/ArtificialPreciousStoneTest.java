package ua.lviv.iot.algo.part1.lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtificialPreciousStoneTest {

    public void testGetFullPrice() {
        ArtificialPreciousStone stone = new ArtificialPreciousStone();
        stone.setGram(5);
        stone.setName("miwa");
        stone.setPricePerGram(100);
        stone.setColor("blue");
        assertEquals(500, stone.getFullPrice());
    }

    public void testToString() {
        ArtificialPreciousStone stone = new ArtificialPreciousStone("miwa", "blue", 5, 100);
        assertEquals("ArtificialPreciousStone(name=miwa, color=blue, gram=5, pricePerGram=100)",
                stone.toString());
    }
}