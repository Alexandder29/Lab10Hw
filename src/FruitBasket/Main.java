package FruitBasket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Strawberry");
        fruits.add("Passion Fruit");
        fruits.add("Peach");
        fruits.add("Plum");

        System.out.println("Fruit list contains: " + "\n" + fruits);
        Basket fruitBasket = new Basket(fruits);

        System.out.println("===Method 'find'===");
        System.out.println(fruitBasket.find("Apple"));

        System.out.println("===Methond 'remove'===");
        System.out.println(fruitBasket.remove("Strawberry"));
        System.out.println(fruitBasket.remove("Orange"));
        System.out.println(fruits);

        System.out.println("===Method 'position'===");
        System.out.println(fruitBasket.position("Peach"));

        System.out.println("===Method 'distinct'===");
        System.out.println(fruitBasket.distinct());

        System.out.println("===Method 'add'===");
        fruitBasket.add("Blueberries");
        System.out.println(fruits);

        System.out.println("===Method 'count'===");
        System.out.println(fruitBasket.count());

        System.out.println("===Method 'customCount'===");
        System.out.println(fruitBasket.customCount());

    }
}
