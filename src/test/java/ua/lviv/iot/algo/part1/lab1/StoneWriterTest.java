package ua.lviv.iot.algo.part1.lab1;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static ua.lviv.iot.algo.part1.lab1.StoneWriter.RESULTS;

class StoneWriterTest {
    public static final File EXPECTED = new File("C:/Users/MIHAILO/IdeaProjects/" +
            "Labs/src/main/resources/expected.scv");
    public static final File EMPTY_DATA = new File("C:/Users/MIHAILO/IdeaProjects/" +
            "Labs/src/main/resources/empty_file.scv");

    private List<Stone> stones;
    private StoneWriter stoneWriter;

    @BeforeEach
    public void setUp() {
        stones = new LinkedList<>();
        stoneWriter = new StoneWriter();
    }

    @Test
    public void testWriteStones() {
        stones.add(new ArtificialPreciousStone("coal", "black", 1000, 100));
        stones.add(new PreciousStone("ruby", "red", 100, 99, 10000));
        stones.add(new PreciousStone("emerald", "green", 143, 95, 20000));
        stones.add(new PreciousStone("diamond", "blue", 200, 97, 30000));
        stones.add(new MethStone("meth", "blue", 2, 95, 40000));
        stones.add(new ExplodingStone("dynamite", "white", 1, 25000));
        stones.add(new ExplodingStone("glycerine", "blue", 2, 1000));
        stoneWriter.writeStones(stones);
        try {
            assertTrue(FileUtils.contentEquals(RESULTS, EXPECTED));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
            assertEquals(false,"FileNotFoundException");
        } catch (IOException e) {
            throw new RuntimeException(e);
            assertEquals(false,"IOException");

        }
    }

    @Test
    public void testWriteEmpty()  {
        stones = new LinkedList<>();
        stoneWriter.writeStones(stones);
        try {
            assertTrue(FileUtils.contentEquals(RESULTS, EMPTY_DATA));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
            assertEquals(false,"FileNotFoundException");
        } catch (IOException e) {
            throw new RuntimeException(e);
            assertEquals(false,"IOException");
        }
    }

    @Test
    public void testOverwriteStones() {
        stoneWriter.writeStones(stones);
        stones = new LinkedList<>();
        testWriteStones();
    }
}
