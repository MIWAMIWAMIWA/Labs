package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class ExplodingStone extends Stone {
    public static final String HEADERS = ",amount,pricePerAmount";
    private int amount;
    private int pricePerAmount;

    @Override
    public int getFullPrice() {
        return getAmount() * getPricePerAmount();
    }

    public ExplodingStone(final String name, final String color,
                          final int amount, final int pricePerAmount) {
        super(name, color);
        this.amount = amount;
        this.pricePerAmount = pricePerAmount;
    }
    @Override
    public String getHeaders() {
        return super.getHeaders() + HEADERS;
    }
    @Override
    public String toSCV() {
        return super.toSCV() + ","
                + Integer.toString(getAmount())
                + "," + Integer.toString(getPricePerAmount());
    }
}
