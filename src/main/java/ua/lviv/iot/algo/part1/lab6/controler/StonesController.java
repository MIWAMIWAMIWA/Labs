package ua.lviv.iot.algo.part1.lab6.controler;

import ua.lviv.iot.algo.part1.lab1.MethStone;
import ua.lviv.iot.algo.part1.lab6.modelDTO.MethStoneDTO;
import ua.lviv.iot.algo.part1.lab6.service.StoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RequestMapping("/stones")
@RestController
public class StonesController {

    @Autowired
    private StoneService stoneService;

    private MethStoneDTO formatStone(final MethStone stone) {
        return new MethStoneDTO(
                stone.getId(),
                stone.getName(),
                stone.getColor(),
                stone.getPound(),
                stone.getClarity(),
                stone.getPricePerPound()
        );
    }

    public static final ResponseEntity OK = ResponseEntity
            .status(HttpStatusCode.valueOf(200)).build();

    public static final ResponseEntity FAILURE = ResponseEntity
            .status(HttpStatusCode.valueOf(404)).build();

    @GetMapping
    public List<MethStoneDTO> getStones() {
        List<MethStoneDTO> response = new LinkedList<>();
        for (MethStone stone : stoneService.giveAll()) {
            response.add(formatStone(stone));
        }
        return response;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getStone(final @PathVariable("id") int stoneId) {
        if (!stoneService.hasStoneWith(stoneId)) {
            return FAILURE;
        } else {
            return ResponseEntity.ok(formatStone(stoneService
                    .giveStone(stoneId)));
        }
    }

    @PostMapping
    public MethStoneDTO createStone(final @RequestBody MethStone stone) {
        stoneService.addStone(stone);
        return formatStone(stoneService.giveStone(stone.getId()));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity deleteStone(final @PathVariable("id") int stoneId) {
        if (stoneService.deleteStone(stoneId) == null) {
            return FAILURE;
        } else {
            return OK;
        }
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity updateMethStone(final @PathVariable("id") int stoneId,
                                          final @RequestBody MethStone stone) {
        if (stoneService.hasStoneWith(stoneId)) {
            stoneService.replaceStone(stone, stoneId);
            return OK;
        } else {
            return FAILURE;
        }
    }
}
