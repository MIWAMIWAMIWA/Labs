package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)

public class MethStone extends Stone {

    private Integer id;

    public static final String HEADERS = ",id,pound,clarity,pricePerPound";

    public static final int PERCENTAGE = 100;

    private int pound;

    private int clarity;

    private int pricePerPound;


    public MethStone(final String name, final String color, final int pound,
                     final int clarity, final int pricePerPound) {
        super(name, color);
        this.pound = pound;
        this.clarity = clarity;
        this.pricePerPound = pricePerPound;
    }

    @Override
    public int getFullPrice() {
        return getPound() * getPricePerPound() * getClarity() / PERCENTAGE;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + HEADERS;
    }

    @Override
    public String toSCV() {
        return super.toSCV()
                + "," + Integer.toString(getId())
                + "," + Integer.toString(getPound())
                + "," + Integer.toString(getClarity())
                + "," + Integer.toString(getPricePerPound());
    }
}
