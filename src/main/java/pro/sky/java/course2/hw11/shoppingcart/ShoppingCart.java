package pro.sky.java.course2.hw11.shoppingcart;

import java.util.Map;
import java.util.Objects;

public class ShoppingCart {
    private Map<Integer, Integer> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = shoppingCart;
    }

    public Map<Integer, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Map<Integer, Integer> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return Objects.equals(shoppingCart, that.shoppingCart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shoppingCart);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "shoppingCart=" + shoppingCart +
                '}';
    }
}
