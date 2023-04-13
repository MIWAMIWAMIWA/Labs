package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;


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

    public void addStone(final Stone stone) {
        stones.add(stone);
    }

    public void addStone(final List<Stone> stoneList) {
        stones.addAll(stoneList);
    }

    public List<Stone> findAllLower(final int money) {
        return stones.stream()
                .filter(stone -> stone.getFullPrice() <= money).toList();
    }
    public static void main(String args[]){

    }

}
