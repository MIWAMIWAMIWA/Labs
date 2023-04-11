package ua.lviv.iot.algo.part1.lab1;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethStoneTest {
    private MethStone stone;

    @BeforeEach
    public void setUp() {
        stone=new MethStone();
        stone.setClarity(90);
        stone.setPound(4);
        stone.setPricePerPound(40000);
        stone.setName("miwa");
        stone.setColor("blue");
    }
    @Test
    public void testGetFullPrice() {
        assertEquals(144000, stone.getFullPrice());
    }

}