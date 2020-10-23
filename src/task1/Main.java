package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int totalprice=0;
        Scanner sc=new Scanner(System.in);
        Person person=new Person();
        System.out.print("Количество предметов, которое хотите купить: ");
        int k=sc.nextInt();

        for (int i=0;i<k;i++)
        {
            System.out.println("Выберете мебель, которую хотите добавить в корзину: " +
                    "1 - Стол, 2 - Шкаф, 3 - Диван");
            FurnitureShop.add(person);
        }
        System.out.println("В вашей корзине:");
        for (int i=0;i<k;i++)
        {
            System.out.println(person.customerscard.get(i).type+" which costs "+person.customerscard.get(i).price);
            totalprice+=person.customerscard.get(i).price;
        }
        System.out.println("Total price: "+totalprice);
    }
}
