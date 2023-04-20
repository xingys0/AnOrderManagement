//This class represents a customer with an ID and a name.
public class Customer {

    private int id;
    private String name;
// Constructor that takes in an ID and a name and initializes the fields.
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
 // Getter method for the "id" field.
    public int getId() {
        return id;
    }
// Setter method for the "id" field.
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
// Override the toString() method to return a formatted string representation of the object.
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
