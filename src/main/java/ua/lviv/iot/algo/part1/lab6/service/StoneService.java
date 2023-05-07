package ua.lviv.iot.algo.part1.lab6.service;

import org.springframework.stereotype.Service;
import ua.lviv.iot.algo.part1.lab1.MethStone;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class StoneService {

    private Map<Integer, MethStone> stones = new HashMap<>();

    private AtomicInteger nextId = new AtomicInteger();

    public MethStone deleteStone(final int id) {
        return stones.remove(id);
    }

    public void replaceStone(final MethStone stone, final int id) {
        stones.remove(id);
        stone.setId(id);
        stones.put(id, stone);
    }

    public MethStone addStone(final MethStone stone) {
        stone.setId(nextId.incrementAndGet());
        stones.put(stone.getId(), stone);
        return stone;
    }

    public Collection<MethStone> giveAll() {
        return stones.values();
    }

    public MethStone giveStone(final int id) {
        return stones.get(id);
    }

    public boolean hasStoneWith(final int id) {
        return stones.containsKey(id);
    }
}
