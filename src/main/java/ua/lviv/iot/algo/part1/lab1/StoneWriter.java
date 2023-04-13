package ua.lviv.iot.algo.part1.lab1;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class StoneWriter {
    public static final File RESULTS = new File("C:/Users/MIHAILO/IdeaProjects/" +
            "Labs/src/main/resources/results.scv");

    public void writeStones(final List<Stone> stones) {
        try {

            FileWriter outputfile = new FileWriter(RESULTS, false);
            CSVWriter writer = new CSVWriter(outputfile);
            List<Stone> ArtPreStones = new LinkedList<>();
            List<Stone> PreStones = new LinkedList<>();
            List<Stone> MethStones = new LinkedList<>();
            List<Stone> ExplodingStones = new LinkedList<>();
            for (Stone stone : stones) {
                if (stone.getClass() == MethStone.class) {
                    MethStones.add(stone);
                } else if (stone.getClass() == PreciousStone.class) {
                    PreStones.add(stone);
                } else if (stone.getClass() == ExplodingStone.class) {
                    ExplodingStones.add(stone);
                } else {
                    ArtPreStones.add(stone);
                }
            }
            List<List<Stone>> AllStones = new LinkedList<>();
            AllStones.add(ArtPreStones);
            AllStones.add(PreStones);
            AllStones.add(MethStones);
            AllStones.add(ExplodingStones);
            for (List<Stone> list_of_stones : AllStones) {
                if (list_of_stones.size() != 0) {
                    writer.writeNext(list_of_stones.get(0)
                            .getHeaders().split(","));
                }
                for (Stone stone : list_of_stones) {
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
