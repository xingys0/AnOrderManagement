public class Product {
// instance variable for product name
    private String name;
// instance variable for product price
    private double price;
// instance variable for product number
    private int number;
// constructor to initialize instance variables
    public Product(String name, double price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }
// setter method for name instance variable
    public void setName(String name) {
        this.name = name;
    }
// setter method for price instance variable
    public void setPrice(double price) {
        this.price = price;
    }
// setter method for number instance variable
    public void setNumber(int number) {
        this.number = number;
    }
// getter method for name instance variable
    public String getName() {
        return name;
    }
// getter method for price instance variable
    public double getPrice() {
        return price;
    }
 // getter method for number instance variable
    public int getNumber() {
        return number;
    }
 // overridden toString method to return string representation of product
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}
