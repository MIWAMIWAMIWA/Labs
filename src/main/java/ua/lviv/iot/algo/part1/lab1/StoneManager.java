package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.swing.plaf.synth.SynthStyle;

@NoArgsConstructor
@Getter
public class StoneManager {
    private List<Stone> stones = new LinkedList<>();

    public List<Stone> findAllLegal() {
        return stones
                .stream()
                .filter(stone -> stone.getClass() == PreciousStone.class
                        || stone.getClass() == ArtificialPreciousStone.class)
                .toList();
    }

    public void addStone(Stone stone) {
        stones.add(stone);
    }

    public void addStone(List<Stone> stoneList) {
        stones.addAll(stoneList);
    }

    public List<Stone> findAllLower(int money) {
        return stones.stream().filter(stone -> stone.getFullPrice() <= money).toList();
    }

}
