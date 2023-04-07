package ua.lviv.iot.algo.part1.lab1;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class StoneManagerTest extends TestCase {
    @Test
    public void testFindAllLegal() {
        StoneManager miwa = new StoneManager();
        miwa.addStone(new ArtificialPreciousStone("coal", "black", 1000, 100));
        miwa.addStone(new MethStone());
        List<Stone> arr2 = miwa.findAllLegal();
        assertEquals("ArtificialPreciousStone(name=coal, color=black, gram=1000, pricePerGram=100)",
                arr2.get(0).toString());
    }

    @Test
    public void testFindAllLower() {
        StoneManager miwa = new StoneManager();
        List<Stone> miwa2 = new LinkedList<>();
        miwa2.add(new ArtificialPreciousStone("coal", "black", 1000, 100));
        miwa2.add(new ArtificialPreciousStone("coal", "black", 1000, 700));
        miwa.addStone(miwa2);
        List<Stone> arr2 = miwa.findAllLower(200000);
        assertEquals("ArtificialPreciousStone(name=coal, color=black, gram=1000, pricePerGram=100)",
                arr2.get(0).toString());
    }

    @Test
    public void testGetStones() {

    }
}