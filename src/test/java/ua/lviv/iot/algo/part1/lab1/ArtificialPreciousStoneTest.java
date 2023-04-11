package ua.lviv.iot.algo.part1.lab1;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtificialPreciousStoneTest {
    private ArtificialPreciousStone stone ;
    @BeforeEach
    public void setUp() {
        stone=new ArtificialPreciousStone();
        stone.setGram(5);
        stone.setName("miwa");
        stone.setPricePerGram(100);
        stone.setColor("blue");
    }
    @Test
    public void testGetFullPrice(){
        Assert.assertEquals(500,stone.getFullPrice());
    }

}