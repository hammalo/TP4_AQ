package org.example;

public class OrderController {
    private OrderService orderService;

    // Constructor
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public void createOrder(Order order) {
        orderService.createOrder(order);
    }
}
