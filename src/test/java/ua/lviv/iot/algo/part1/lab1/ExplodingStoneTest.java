package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ExplodingStoneTest {

    private ExplodingStone stone;

    @BeforeEach
    public void setUp() {
        stone = new ExplodingStone();
        stone.setAmount(3);
        stone.setName("miwa");
        stone.setColor("dark");
        stone.setPricePerAmount(100);
    }

    @Test
    public void testGetFullPrice() {
        assertEquals(300, stone.getFullPrice());
    }
}