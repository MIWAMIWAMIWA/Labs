package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PreciousStone extends Stone {

    private int carat;
    private int clarity;
    private int pricePerCarat;
    private static PreciousStone defaultPreciousStone = new PreciousStone();

    public static PreciousStone getInstance() {
        return defaultPreciousStone;
    }

    @Override
    public int getFullPrice() {
        return this.getPricePerCarat() * this.getCarat();
    }

    public void increaseClarity() {
        this.setClarity(this.getClarity() + 1);
    }

    public void increasePrice(double percentage) {
        this.setPricePerCarat((int) ((percentage + 1.0) * (double) this.getPricePerCarat()));
    }

    public PreciousStone(String name, String color, int carat, int clarity, int pricePerCarat) {
        super(name, color);
        this.carat = carat;
        this.clarity = clarity;
        this.pricePerCarat = pricePerCarat;
    }

    @Override
    public String toString() {
        return "PreciousStone(name=" + getName() + ", color=" + getColor() + ", carat=" + getCarat()
                + ", clarity=" + getClarity() + ", pricePerCarat=" + getPricePerCarat() + ")";
    }


}