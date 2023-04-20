

import java.util.List;

public class OrderManagement {
// A private List of Order objects named "orders"
    private List<Order> orders;
//A public method that returns the "orders" List
    public List<Order> getOrders() {
        return orders;
    }
//A public method that sets the "orders" List
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
