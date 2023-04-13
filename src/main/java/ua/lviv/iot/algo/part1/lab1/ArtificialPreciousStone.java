package ua.lviv.iot.algo.part1.lab1;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class ArtificialPreciousStone extends Stone {
    private int gram;
    private int pricePerGram;

    @Override
    public int getFullPrice() {
        return getGram() * getPricePerGram();
    }

    public ArtificialPreciousStone(final String name, final String color,
                                    final int gram, final int pricePerGram) {
        super(name, color);
        this.gram = gram;
        this.pricePerGram = pricePerGram;
    }

}
