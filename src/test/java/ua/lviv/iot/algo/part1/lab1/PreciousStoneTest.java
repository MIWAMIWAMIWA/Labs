package ua.lviv.iot.algo.part1.lab1;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PreciousStoneTest extends TestCase {

    private PreciousStone stone;

    @BeforeEach
    public void setUp() {
        stone=new PreciousStone();
        stone.setName("miwa");
        stone.setColor("red");
        stone.setCarat(100);
        stone.setClarity(90);
        stone.setPricePerCarat(100);
    }

    @Test
    public void testGetFullPrice() {

        assertEquals(10000, stone.getFullPrice());
    }

    @Test
    public void testIncreaseClarity() {
        stone.increaseClarity();
        assertEquals(91, stone.getClarity());
    }

    @Test
    public void testIncreasePrice() {
        stone.increasePrice(0.1);
        assertEquals(110, stone.getPricePerCarat());
    }

}
