package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
public class ExplodingStone extends Stone {
    private int amount;
    private int pricePerAmount;
    @Override
    public int getFullPrice(){
        return getAmount()*getPricePerAmount();
    }
    public ExplodingStone(String name,String color,int amount ,int pricePerAmount){
        super(name,color);
        this.amount=amount;
        this.pricePerAmount=pricePerAmount;
    }
    @Override
    public String toString(){
        return "ExplodingStone(name="+getName()+", color="+getColor()+
                ", amount="+getAmount()+", pricePerAmount="+getPricePerAmount()+")";
    }
}
