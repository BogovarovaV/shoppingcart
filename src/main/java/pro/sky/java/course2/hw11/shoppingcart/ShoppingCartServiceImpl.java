package pro.sky.java.course2.hw11.shoppingcart;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@Scope("singleton")
public class ShoppingCartServiceImpl implements ShoppingCartService{

    private final List<Collection<Integer>> shoppingCart = new ArrayList<>();


    @Override
    public void addItem(Collection<Integer> itemId) {
        if (itemId == null) {
            throw new BadRequestException();
        } else {
            shoppingCart.add(itemId);
        }
    }

    @Override
    public String getItems() {
        return shoppingCart.toString();
    }
}
