package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class PreciousStone extends Stone {

    private int carat;
    private int clarity;
    private int pricePerCarat;

    @Override
    public int getFullPrice() {
        return this.getPricePerCarat() * this.getCarat();
    }

    public void increaseClarity() {
        this.setClarity(this.getClarity() + 1);
    }

    public void increasePrice(final double percentage) {
        this.setPricePerCarat((int) ((percentage + 1.0)
                * (double) this.getPricePerCarat()));
    }

    public PreciousStone(final String name, final String color,
                         final int carat, final int clarity,
                         final int pricePerCarat) {
        super(name, color);
        this.carat = carat;
        this.clarity = clarity;
        this.pricePerCarat = pricePerCarat;
    }

    @Override
    public String toString() {
        return "PreciousStone(name=" + getName() + ", color="
                + getColor() + ", carat=" + getCarat()
                + ", clarity=" + getClarity()
                + ", pricePerCarat=" + getPricePerCarat() + ")";
    }


}
