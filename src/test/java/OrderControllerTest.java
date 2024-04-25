import org.example.Order;
import org.example.OrderController;
import org.example.OrderDao;
import org.example.OrderService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class OrderControllerTest {
    @Test
    public void testCreateOrder() {
        // Mock objects
        OrderService mockOrderService = mock(OrderService.class);
        OrderDao mockOrderDao = mock(OrderDao.class);

        // Create instance
        OrderController orderController = new OrderController(mockOrderService);

        // Test data
        Order order = new Order(123, "John Doe", 100.0);

        // Call the method
        orderController.createOrder(order);

        // Verify that OrderService.createOrder is called with the correct argument
        verify(mockOrderService).createOrder(order);
    }
}
