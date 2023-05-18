package ua.lviv.iot.algo.part1.lab1;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class StoneWriter {
    public static final File RESULTS = new File("src" + File.separator
             + "main" + File.separator
             + "resources" + File.separator
             + "results.scv");

    public void writeStones(final List<Stone> stones) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(RESULTS, false))) {
            stones.sort(Comparator.comparing(o -> o.getClass().getName()));
            Class current = null;
            for (Stone stone : stones) {
                if (stone.getClass() != current) {
                    writer.writeNext(stone.getHeaders().split(","));
                    current = stone.getClass();
                }
                writer.writeNext(stone.toSCV().split(","));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
