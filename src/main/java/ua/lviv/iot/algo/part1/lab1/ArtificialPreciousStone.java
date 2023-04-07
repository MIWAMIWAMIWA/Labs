package ua.lviv.iot.algo.part1.lab1;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ArtificialPreciousStone extends Stone {
    private int gram;
    private int pricePerGram;

    @Override
    public int getFullPrice() {
        return getGram() * getPricePerGram();
    }

    public ArtificialPreciousStone(String name, String color, int gram, int pricePerGram) {
        super(name, color);
        this.gram = gram;
        this.pricePerGram = pricePerGram;
    }

    @Override
    public String toString() {
        return "ArtificialPreciousStone(name=" + getName() + ", color=" + getColor() +
                ", gram=" + getGram() + ", pricePerGram=" + getPricePerGram() + ")";
    }

}
