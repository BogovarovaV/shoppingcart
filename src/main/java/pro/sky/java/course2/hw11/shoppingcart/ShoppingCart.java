package pro.sky.java.course2.hw11.shoppingcart;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ShoppingCart {
    private List<Collection<Integer>> shoppingCart;

    public ShoppingCart(List<Collection<Integer>> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<Collection<Integer>> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Collection<Integer>> shoppingCart) {
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
