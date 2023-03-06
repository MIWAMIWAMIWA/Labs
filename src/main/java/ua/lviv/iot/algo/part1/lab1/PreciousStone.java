package ua.lviv.iot.algo.part1.lab1;
import lombok.*;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PreciousStone {
    private String name;
    private int carat;
    private String color;
    private int clarity;
    private int pricePerCarat;
    private static PreciousStone defaultPreciousStone = new PreciousStone();

    public static PreciousStone getInstance() {
        return defaultPreciousStone;
    }

    public int getTotalPrice() {
        return this.getPricePerCarat() * this.getCarat();
    }

    public void increaseClarity() {
        this.setClarity(this.getClarity() + 1);
    }

    public void increasePrice(double percentage) {
        int newPrice = (int)((percentage + 1.0) * (double)this.getPricePerCarat());
        this.setPricePerCarat(newPrice);
    }

    public static void main(String[] args) {
        PreciousStone miwa3 = new PreciousStone();
        PreciousStone miwa4 = new PreciousStone("miwa", 1000, "red", 99, 10000);
        PreciousStone miwa1 = getInstance();
        PreciousStone miwa2 = getInstance();
        miwa1.setClarity(12);
        miwa2.setClarity(34);
        PreciousStone[] arr = new PreciousStone[]{miwa1, miwa2, miwa3, miwa4};
        for(int i = 0; i < arr.length; ++i) {
            PreciousStone preciousStone = arr[i];
            System.out.println(preciousStone.toString());
        }

    }
}