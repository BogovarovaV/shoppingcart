package pro.sky.java.course2.hw11.shoppingcart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/order")

public class ShoppingCartController {
    private final ShoppingCartServiceImpl shoppingCartService;

    public ShoppingCartController(ShoppingCartServiceImpl shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public String addItem(@RequestParam Collection<Integer> itemId) {
        shoppingCartService.addItem(itemId);
        return "Товар(ы) " + itemId + " добавлен(ы) в корзину.";
    }

    @GetMapping("/get")
    public String getItems() {
        return shoppingCartService.getItems();
    }
}