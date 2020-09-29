package task1;

public class FurnitureType extends Furniture {

    public FurnitureType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void getName()
    {
        System.out.println("Type of furniture: " + name);
    }

    @Override
    public void getColor()
    {
        System.out.println("Color: " + color);
    }

}