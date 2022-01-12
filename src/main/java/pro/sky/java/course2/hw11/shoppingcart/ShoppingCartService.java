package pro.sky.java.course2.hw11.shoppingcart;

import java.util.Collection;

public interface ShoppingCartService {

    void addItem (Collection<Integer> itemId);
    String getItems ();
}
