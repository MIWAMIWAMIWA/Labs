package ua.lviv.iot.algo.part1.lab1;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class PreciousStoneTest extends TestCase {
    @Test
    public void testGetFullPrice() {
        PreciousStone stone = new PreciousStone();
        stone.setName("miwa");
        stone.setColor("red");
        stone.setCarat(100);
        stone.setClarity(90);
        stone.setPricePerCarat(100);
        assertEquals(10000, stone.getFullPrice());
    }

    @Test
    public void testIncreaseClarity() {
        PreciousStone stone = new PreciousStone();
        stone.setName("miwa");
        stone.setColor("red");
        stone.setCarat(100);
        stone.setClarity(90);
        stone.setPricePerCarat(100);
        stone.increaseClarity();
        assertEquals(91, stone.getClarity());
    }

    @Test
    public void testIncreasePrice() {
        PreciousStone stone = PreciousStone.getInstance();
        stone.setName("miwa");
        stone.setColor("red");
        stone.setCarat(100);
        stone.setClarity(90);
        stone.setPricePerCarat(100);
        stone.increasePrice(0.1);
        assertEquals(110, stone.getPricePerCarat());
    }

    @Test
    public void testTestToString() {
        PreciousStone stone = new PreciousStone("miwa", "red", 100, 90, 100);
        assertEquals("PreciousStone(name=miwa, color=red, carat=100, clarity=90, pricePerCarat=100)",
                stone.toString());
    }
}