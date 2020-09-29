package task1;

public class FurnitureShop extends FurnitureType {

    public int year;
    public double price;
    public FurnitureShop(String name, String color, int year, double price) {
        super(name, color);
        this.year=year;
        this.price=price;
    }
}