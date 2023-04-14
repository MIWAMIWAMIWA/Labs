package ua.lviv.iot.algo.part1.lab1;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class StoneWriter {
    public static final File RESULTS = new File("C:/Users/"
            + "MIHAILO/IdeaProjects/"
            + "Labs/src/main/resources/results.scv");

    public void writeStones(final List<Stone> stones) {
        try {

            FileWriter outputfile = new FileWriter(RESULTS, false);
            CSVWriter writer = new CSVWriter(outputfile);
            List<Stone> artPreStones = new LinkedList<>();
            List<Stone> preStones = new LinkedList<>();
            List<Stone> methStones = new LinkedList<>();
            List<Stone> explodingStones = new LinkedList<>();
            for (Stone stone : stones) {
                if (stone.getClass() == MethStone.class) {
                    methStones.add(stone);
                } else if (stone.getClass() == PreciousStone.class) {
                    preStones.add(stone);
                } else if (stone.getClass() == ExplodingStone.class) {
                    explodingStones.add(stone);
                } else {
                    artPreStones.add(stone);
                }
            }
            List<List<Stone>> allStones = new LinkedList<>();
            allStones.add(artPreStones);
            allStones.add(preStones);
            allStones.add(methStones);
            allStones.add(explodingStones);
            for (List<Stone> listOfStones : allStones) {
                if (listOfStones.size() != 0) {
                    writer.writeNext(listOfStones.get(0)
                            .getHeaders().split(","));
                }
                for (Stone stone : listOfStones) {
                    writer.writeNext(stone
                            .toSCV().split(","));
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
