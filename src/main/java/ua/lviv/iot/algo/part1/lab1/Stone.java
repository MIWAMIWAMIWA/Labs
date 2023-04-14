package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class Stone {
    public static final String HEADERS = "name,color";
    private String name;
    private String color;
    public String getHeaders() {
        return HEADERS;
    }
    public String toSCV() {
        return name + "," + color;
    }
    public   abstract int getFullPrice();

}

