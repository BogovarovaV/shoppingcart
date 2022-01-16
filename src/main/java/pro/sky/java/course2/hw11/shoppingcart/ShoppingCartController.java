package pro.sky.java.course2.hw11.shoppingcart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/order")

public class ShoppingCartController {
    private final ShoppingCartServiceImpl shoppingCartService;

    public ShoppingCartController(ShoppingCartServiceImpl shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public String addItem(@RequestParam Integer orderItems) {
        shoppingCartService.addItem(orderItems);
        return "Товар(ы) " + orderItems + " добавлен(ы) в корзину.";
    }

    @GetMapping("/get")
    public Map<Integer, Integer> getItems() {
        return shoppingCartService.getItems();
    }
}
