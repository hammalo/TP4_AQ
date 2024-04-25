package org.example;

public class OrderService {
    private OrderDao orderDao;

    // Constructor
    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void createOrder(Order order) {
        // Business logic for creating an order
        orderDao.saveOrder(order);
    }
}
