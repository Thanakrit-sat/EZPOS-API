package ezpos.program.EZPOS.controller;

import ezpos.program.EZPOS.model.OrderItem;
import ezpos.program.EZPOS.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orderitem")
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.getAllOrderItems();
    }

    @PostMapping
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.createOrderItem(orderItem);
    }
}
