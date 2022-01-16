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
    public void addItem(Integer orderItems, Integer quantity) {
//            if (shoppingCart.getShoppingCart().containsKey(orderItems)) {
//                shoppingCart.getShoppingCart().put(orderItems, shoppingCart.getShoppingCart().get(orderItems) + quantity);
//            } else {
                shoppingCart.getShoppingCart().put(orderItems, quantity);
//            }

    }

    @Override
    public Map<Integer, Integer> getItems() {
        return shoppingCart.getShoppingCart();
    }
}
