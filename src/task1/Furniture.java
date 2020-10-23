package task1;

public abstract class Furniture {
    public String color,type;
    public int price;
    public int weight;

    public Furniture(String color,int weight,int price,String type){
        this.color=color;
        this.weight=weight;
        this.price=price;
        this.type=type;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getType(){
        return type;
    }
}