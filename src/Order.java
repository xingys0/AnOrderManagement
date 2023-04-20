public class Order {
    private int order_id;// private field for order ID
    private int user_id;// private field for user ID
    private String detail;// private field for order details

// constructor to create a new Order object with specified order ID, user ID, and order details
    public Order(int order_id, int user_id, String detail) {
        this.order_id = order_id;
        this.user_id = user_id;
        this.detail = detail;
    }

    public int getOrder_id() {
        return order_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getDetail() {
        return detail;
    }
// method to return a string representation of the Order object
    @Override
    public String toString() {
        return "orderId:"+order_id+" userId:"+user_id+"detail: "+detail+"\n";
    }
}
