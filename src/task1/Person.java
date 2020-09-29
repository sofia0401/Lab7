package task1;

public class Person extends FurnitureShop{

    public Person(String name, String color, int year, double price) {
        super(name, color, year, price);
    }

    public static void main(String[] args) {
        FurnitureShop item1=new FurnitureShop("table","black", 2020, 32.32);
        FurnitureShop item2=new FurnitureShop("couch","yellow", 2019, 43.32);
        FurnitureShop item3=new FurnitureShop("closet","white",123,56.24);
        System.out.println("In customer's card:");
        if (item1.price<50.564) {
            Person bag1=new Person(item1.name,item1.color,item1.year,item1.price);
            bag1.getName();
            bag1.getColor();
        }
        if (item2.price<50.564) {
            Person bag2=new Person(item2.name,item2.color,item2.year,item2.price);
            bag2.getName();
            bag2.getColor();
        }
        if (item3.price<50.564) {
            Person bag3=new Person(item3.name,item3.color,item3.year, item3.price);
            bag3.getName();
            bag3.getColor();
        }
    }
}
