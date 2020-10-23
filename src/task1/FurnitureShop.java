package task1;

import java.util.Scanner;

public class FurnitureShop {

    static void add(Person person) {
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                person.customerscard.add(new Table("black", 32, 3632, "Table"));
                break;
            case 2:
                person.customerscard.add(new Closet("white", 65, 2468, "Closet"));
                break;
            case 3:
                person.customerscard.add(new Couch("yellow", 90, 7684, "Couch"));
                break;
        }
    }
}
