package pro.sky.java.course2.hw11.shoppingcart;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

    private final ShoppingCart shoppingCart;

    public ShoppingCartServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void addItem(List<Integer> orderItems) {
        Map<Integer, Integer> currentCart = shoppingCart.getShoppingCart();
        orderItems.stream().forEach(i -> currentCart.put (i, currentCart.getOrDefault(i, 0) + 1));
    }

    @Override
    public Map<Integer, Integer> getItems() {
        return shoppingCart.getShoppingCart();
    }
}
