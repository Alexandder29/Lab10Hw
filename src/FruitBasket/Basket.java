package FruitBasket;

import java.util.List;
import java.util.Objects;

public class Basket {
    private List<String> basket;

    public Basket(List<String> basket) {
        this.basket = basket;
    }

    public boolean find(String findFruit) {
        return basket.contains(findFruit);
    }

    public boolean remove(String removeFruit) {
        if (basket.contains(removeFruit)) {
            basket.remove(removeFruit);
            return true;
        }
        return false;
    }

    public int position(String fruitPosition) {
        for (int i = 0; i < basket.size(); i++) {
            if (Objects.equals(basket.get(i), fruitPosition)) {
                return i;
            }
        }
        return 0;
    }

    public List<String> distinct() {
        return basket;
    }

    public void add(String addFruit) {
        basket.add(addFruit);
    }

    public int count() {
        return basket.size();
    }

    public int customCount() {
        int counter = 0;
        for (int i = 0; i < basket.size(); i++) {
            counter++;
        }
        return counter;
    }

}
