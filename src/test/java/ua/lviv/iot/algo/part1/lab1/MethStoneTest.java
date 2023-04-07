package ua.lviv.iot.algo.part1.lab1;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class MethStoneTest extends TestCase {
    @Test
    public void testGetFullPrice() {
        MethStone meth = new MethStone();
        meth.setClarity(90);
        meth.setPound(4);
        meth.setPricePerPound(40000);
        meth.setName("miwa");
        meth.setColor("blue");
        assertEquals(144000, meth.getFullPrice());
    }

    @Test
    public void testTestToString() {
        MethStone meth = new MethStone("miwa", "blue", 4, 90, 40000);
        assertEquals("MethStone(name=miwa, color=blue, pound=4, clarity=90, pricePerPound=40000)",
                meth.toString());
    }
}