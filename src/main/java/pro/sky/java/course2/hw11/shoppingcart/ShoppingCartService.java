package pro.sky.java.course2.hw11.shoppingcart;

import java.util.Map;

public interface ShoppingCartService {

    void addItem (Integer orderItems, Integer quantity);
    Map<Integer, Integer> getItems ();
}
