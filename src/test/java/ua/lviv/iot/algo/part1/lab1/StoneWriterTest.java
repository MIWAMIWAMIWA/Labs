package ua.lviv.iot.algo.part1.lab1;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static ua.lviv.iot.algo.part1.lab1.StoneWriter.RESULTS;

class StoneWriterTest {
    public static final File TEST_DATA = new File("C:/Users/MIHAILO/IdeaProjects/" +
            "Labs/src/main/resources/test_data.scv");
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
    public void writeStones() {
        stones.add(new ArtificialPreciousStone("coal", "black", 1000, 100));
        stones.add(new PreciousStone("ruby", "red", 100, 99, 10000));
        stones.add(new MethStone("meth", "blue", 2, 95, 40000));
        stones.add(new ExplodingStone("dynamite", "white", 1, 25000));
        stoneWriter.writeStones(stones);
        try {
            assertTrue(FileUtils.contentEquals(RESULTS, TEST_DATA));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void writeEmpty() {
        stones = new LinkedList<>();
        stoneWriter.writeStones(stones);
        try {
            assertTrue(FileUtils.contentEquals(RESULTS, EMPTY_DATA));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void overwriteStones() {
        stones.add(new MethStone("meth", "blue", 1, 95, 40001));
        stones.add(new MethStone("meth", "blue", 2, 96, 40002));
        stones.add(new MethStone("meth", "blue", 3, 97, 40003));
        stoneWriter.writeStones(stones);
        stones = new LinkedList<>();
        stones.add(new ArtificialPreciousStone("coal", "black", 1000, 100));
        stones.add(new PreciousStone("ruby", "red", 100, 99, 10000));
        stones.add(new MethStone("meth", "blue", 2, 95, 40000));
        stones.add(new ExplodingStone("dynamite", "white", 1, 25000));
        stoneWriter.writeStones(stones);
        try {
            assertTrue(FileUtils.contentEquals(RESULTS, TEST_DATA));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
