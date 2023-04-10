package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ExplodingStoneTest {
    @Test
    public void testGetFullPrice() {
        ExplodingStone stone = new ExplodingStone();
        stone.setAmount(3);
        stone.setName("miwa");
        stone.setColor("dark");
        stone.setPricePerAmount(100);
        assertEquals(300, stone.getFullPrice());
    }
}