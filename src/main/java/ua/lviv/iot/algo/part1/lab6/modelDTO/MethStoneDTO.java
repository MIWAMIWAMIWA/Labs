package ua.lviv.iot.algo.part1.lab6.modelDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class MethStoneDTO {
    private int id;
    private String name;
    private String color;
    private int pound;
    private int clarity;
    private int  pricePerPound;

}
