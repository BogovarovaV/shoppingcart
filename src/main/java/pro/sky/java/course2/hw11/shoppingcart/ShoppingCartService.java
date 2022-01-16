package pro.sky.java.course2.hw11.shoppingcart;

import java.util.Map;

public interface ShoppingCartService {

    void addItem (Integer orderItems);
    Map<Integer, Integer> getItems ();
}
