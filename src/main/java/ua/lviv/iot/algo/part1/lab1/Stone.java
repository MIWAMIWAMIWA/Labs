package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public  abstract class Stone {
    private String name;
    private String color;
    public abstract int getFullPrice();

}

