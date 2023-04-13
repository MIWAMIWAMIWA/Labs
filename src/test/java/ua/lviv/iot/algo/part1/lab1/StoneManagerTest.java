package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoneManagerTest {

    private StoneManager manager;
    @BeforeEach
    public  void setUp() {
        manager=new StoneManager();
        manager.addStone(new ArtificialPreciousStone("coal", "black", 1000, 100));
        manager.addStone(new MethStone());
        manager.addStone(new ArtificialPreciousStone("soap", "black", 1000, 100));
        manager.addStone(new ArtificialPreciousStone("rock", "black", 1000, 700));
    }

    @Test
    public void testFindAllLegal() {

        List<Stone> result = manager.findAllLegal();
        assertEquals(3, result.size());

        for (var stone: result) {
            assertEquals(ArtificialPreciousStone.class, stone.getClass());
        }
    }

    @Test
    public void testFindAllLower() {

        List<Stone> result = manager.findAllLower(200000);
        assertEquals(3, result.size());

        for (var stone: result) {
            assertTrue(stone.getFullPrice() < 200000 );
        }
    }


}