package ua.lviv.iot.algo.part1.lab6.service;


import ua.lviv.iot.algo.part1.lab6.modelDTO.MethStoneDTO;
import lombok.Getter;
import org.springframework.stereotype.Service;
import ua.lviv.iot.algo.part1.lab1.MethStone;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
@Service
@Getter
public class StoneService {

    private Map<Integer, MethStone> stones = new HashMap<>();
    private AtomicInteger nextId = new AtomicInteger();
    public MethStone deleteStone(final int id) {
        return stones.remove(id);
    }
    public MethStone addStone(final MethStone stone) {
        stone.setId(nextId.incrementAndGet());
        stones.put(stone.getId(), stone);
        return stone;
    }
    public List<MethStoneDTO> giveAll() {
        List<MethStoneDTO> response = new LinkedList<>();
        for (MethStone stone: stones.values()) {
            response.add(new MethStoneDTO(
                    stone.getId(),
                    stone.getName(),
                    stone.getColor(),
                    stone.getPound(),
                    stone.getClarity(),
                    stone.getPricePerPound()

            ));
        }
        return response;
    }
    public MethStoneDTO giveStone(final int id) {
        MethStone stone = stones.get(id);
        return  new MethStoneDTO(
                stone.getId(),
                stone.getName(),
                stone.getColor(),
                stone.getPound(),
                stone.getClarity(),
                stone.getPricePerPound()
        );
    }
}
