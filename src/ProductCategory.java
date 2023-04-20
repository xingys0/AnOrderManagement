import java.util.List;

public class ProductCategory {
// a private field that holds a list of Product objects
    private List<Product> products;
// a getter method to retrieve the list of products
    public List<Product> getProducts() {
        return products;
    }
// a setter method to set the list of products
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
