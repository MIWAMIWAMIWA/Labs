package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class MethStone extends Stone {
    private int pound;
    private int clarity;
    private int pricePerPound;

    public MethStone(String name, String color, int pound, int clarity, int pricePerPound) {
        super(name, color);
        this.pound = pound;
        this.clarity = clarity;
        this.pricePerPound = pricePerPound;
    }

    @Override
    public int getFullPrice() {
        return getPound() * getPricePerPound() * getClarity() / 100;
    }

    @Override
    public String toString() {
        return "MethStone(name=" + getName() + ", color=" + getColor() +
                ", pound=" + getPound() +", clarity="+ getClarity()+
                ", pricePerPound=" + getPricePerPound() + ")";
    }
}
