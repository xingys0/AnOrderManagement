
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.jar.Attributes.Name;

public class MainFrame extends JFrame {
 // Create a new MainFrame object and set it to be visible    
    public static void main(String[] args) {
        new MainFrame().setVisible(true);
    }
// Creating 5 Product objects with their names, prices and stock amounts
    Product product1 = new Product("iPhone12, 64G, black",900,0);
    Product product2 = new Product("iMac Air, 256G, gray",1200,0);
    Product product3 = new Product("iPad 4, 128G, gold",400,0);
    Product product4 = new Product("iPod 2, gray",150,0);
    Product product5 = new Product("Apple TV",500,0);
// Creating a new instance of ProductCategory class
    ProductCategory p = new ProductCategory();
// Create  new JButton objects 
    JButton btnSubmit = new JButton("Submit Your Order");
    JButton btnSelect = new JButton("Select");
// Create  new JLabel objects
    JLabel jLabel1 = new JLabel("ProductCategory");
    JLabel jLabel2 = new JLabel("Price");
    JLabel jLabel3 = new JLabel("Quantity");
    JLabel jIdLabel = new JLabel();

    JLabel jPLabel1 = new JLabel();
    JLabel jPLabel2 = new JLabel();
    JLabel jPLabel3 = new JLabel();
    JLabel jPLabel4 = new JLabel();
    JLabel jPLabel5 = new JLabel();
// Create new JLabel as title objects
    JLabel title = new JLabel("Customer Ordering System");
// create 5 text fields for user input
    JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField3 = new JTextField();
    JTextField jTextField4 = new JTextField();
    JTextField jTextField5 = new JTextField();
// create a label for displaying the title of the program
    JLabel jTLable = new JLabel("Customer Order Detail");
// create a text area for displaying order details
    JTextArea jTextArea = new JTextArea();
// create a panel for holding buttons and other components
    JPanel panel = new JPanel();
// create empty lists to store products, customers, and orders
    List<Product>products = new ArrayList<Product>();
    List<Customer> users = new ArrayList<Customer>();
    List<Order> orders = new ArrayList<Order>();
// creates a new instance of the OrderManagement class and assigns it to the variable orderManagement.
    OrderManagement orderManagement = new OrderManagement();
    int id = 1;
    int order_id = 0;

    public MainFrame() {
// Generate a random number between 1 and 10.   
        id = new Random().nextInt(10)+1;
// Add the products to the 'products' list.
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

//  Here we create a list of customers and add 10 Customer objects to it with unique IDs and names.
        users.add(new Customer(1,"Jerry"));
        users.add(new Customer(2,"Lisa"));
        users.add(new Customer(3,"Bob"));
        users.add(new Customer(4,"Sunny"));
        users.add(new Customer(5,"Alice"));
        users.add(new Customer(6,"David"));
        users.add(new Customer(7,"Rob"));
        users.add(new Customer(8,"Terry"));
        users.add(new Customer(9,"Gina"));
        users.add(new Customer(10,"Sherry"));
// Then we set the list of products into the ProductCategory object named 'p'.
        p.setProducts(products);
// Assign 5 products to the labels
        jPLabel1.setText(p.getProducts().get(0).getName()+"    $"+p.getProducts().get(0).getPrice());
        jPLabel2.setText(p.getProducts().get(1).getName()+"    $"+p.getProducts().get(1).getPrice());
        jPLabel3.setText(p.getProducts().get(2).getName()+"       $"+p.getProducts().get(2).getPrice());
        jPLabel4.setText(p.getProducts().get(3).getName()+"                  $"+p.getProducts().get(3).getPrice());
        jPLabel5.setText(p.getProducts().get(4).getName()+"                     $"+p.getProducts().get(4).getPrice());
// Set the size and position of the main frame window      
        this.setBounds(400,150,800,500);
// Set the font, size, and style of the title label
        title.setFont(new Font("黑体",Font.ITALIC,20));
// Set the layout of the panel to null
        panel.setLayout(null);
// Set the bounds and text of the jIdLabel
        jIdLabel.setBounds(0,0,500,50);
        jIdLabel.setText("user_id: "+id);
// Set the bounds of the title, jLabel1, jLabel2, jLabel3, jTLable, btnSelect, and jTextArea
        title.setBounds(160,0,520,50);
        jLabel1.setBounds(0,50,130,50);
        jLabel2.setBounds(140,50,50,50);
        jLabel3.setBounds(200,50,50,50);
        jTLable.setBounds(300,50,200,50);
        btnSelect.setBounds(560,50,160,50);
        jTextArea.setBounds(260,110,500,400);
//  Set jTextArea to be non-editable
        jTextArea.setEditable(false);
// Set the position and size of the product labels
        jPLabel1.setBounds(0,110,330,50);
        jPLabel2.setBounds(0,170,330,50);
        jPLabel3.setBounds(0,230,330,50);
        jPLabel4.setBounds(0,290,330,50);
        jPLabel5.setBounds(0,350,330,50);
// Set the position and size of the text fields for quantity input
        jTextField1.setBounds(200,110,50,50);
        jTextField2.setBounds(200,170,50,50);
        jTextField3.setBounds(200,230,50,50);
        jTextField4.setBounds(200,290,50,50);
        jTextField5.setBounds(200,350,50,50);
// Set the position and size of the "Submit" button
        btnSubmit.setBounds(20,400,160,50);
// adds various components to the panel 
        panel.add(btnSubmit);
        panel.add(title);
        panel.add(jLabel1);
        panel.add(jLabel2);
        panel.add(jLabel3);
        panel.add(jTLable);
        panel.add(jTextArea);

        panel.add(jTextField1);
        panel.add(jTextField2);
        panel.add(jTextField3);
        panel.add(jTextField4);
        panel.add(jTextField5);
        panel.add(jPLabel1);
        panel.add(jPLabel2);
        panel.add(jPLabel3);
        panel.add(jPLabel4);
        panel.add(jPLabel5);
        panel.add(jIdLabel);
        panel.add(btnSelect);

// Set the default close operation for the JFrame to exit the program when the user closes the window.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Add the panel component to the JFrame, with null constraints.
        this.add(panel, null);

//  Add an ActionListener to the btnSelect button
        btnSelect.addActionListener(new ActionListener() {
            @Override
// Override the actionPerformed method to define what happens when the button is pressed
            public void actionPerformed(ActionEvent e) {
                orderManagement.setOrders(orders);
                new SelectFrame(orderManagement).setVisible(true);
            }
        });

//  Add an ActionListener to the submit button
        btnSubmit.addActionListener(new ActionListener() {
            StringBuffer sb = new StringBuffer();

            double ToalPrice = 0;//amount to
            @Override
            public void actionPerformed(ActionEvent e) {
                //order_id


                ToalPrice = 0;//amount to
                order_id +=1;

                String oid = "order_id: "+order_id+"\n";
                String uid = "user_id: "+id+"\n";
                JOptionPane.showMessageDialog(panel,"success！");

//1.checks if the text in the first JTextField ("jTextField1") is not empty.
//2.If it's not empty, it parses the text to an integer and stores it in the variable "num".
//3.Then, it retrieves the product details from the "p" object (a ProductManagement object) for the first product in the list
//4.adds the product name, quantity, Unit price, and total cost to the StringBuffer 
//5.The "total" variable is updated to keep track of the total cost of all products ordered so far.

                if (!jTextField1.getText().equals("")){
                    int num = Integer.parseInt(jTextField1.getText().toString());
                    sb.append("Name： "+ p.getProducts().get(0).getName() +" Quantity："+num+" Price："+p.getProducts().get(0).getPrice()+" Total： "+p.getProducts().get(0).getPrice()*num+"\n");
                    ToalPrice +=num*p.getProducts().get(0).getPrice();
                }
                if (!jTextField2.getText().equals("")){
                    int num = Integer.parseInt(jTextField2.getText().toString());
                    sb.append("Name： "+ p.getProducts().get(1).getName() +" Quantity： "+num+" Price："+p.getProducts().get(1).getPrice()+" Total： "+p.getProducts().get(1).getPrice()*num+"\n");
                    ToalPrice +=num*p.getProducts().get(1).getPrice();
                }
                if (!jTextField3.getText().equals("") ){
                    int num = Integer.parseInt(jTextField3.getText().toString());
                    sb.append("Name： "+ p.getProducts().get(2).getName() +" Quantity： "+num+" Price："+p.getProducts().get(2).getPrice()+" Total： "+p.getProducts().get(2).getPrice()*num+"\n");
                    ToalPrice +=num*p.getProducts().get(2).getPrice();
                }
                if (!jTextField4.getText().equals("")){
                    int num = Integer.parseInt(jTextField4.getText().toString());
                    sb.append("Name： "+ p.getProducts().get(3).getName() +" Quantity： "+num+" Price："+p.getProducts().get(3).getPrice()+" Total： "+p.getProducts().get(3).getPrice()*num+"\n");
                    ToalPrice +=num*p.getProducts().get(3).getPrice();
                }
                if (!jTextField5.getText().equals("")){
                    int num = Integer.parseInt(jTextField5.getText().toString());
                    sb.append("Name： "+ p.getProducts().get(4).getName() +" Quantity： "+num+" Price："+p.getProducts().get(4).getPrice()+" Total： "+p.getProducts().get(4).getPrice()*num+"\n");
                    ToalPrice +=num*p.getProducts().get(4).getPrice();
                }

                sb.append("Amount to： "+ToalPrice + " USD");
                orders.add(new Order(order_id,id,sb.toString()));

//Using a new user. Generate a user ID from 1 to 10 using random numbers.
                id = new Random().nextInt(10)+1;
                // jIdLabel.setText("user_id: "+id);
                jIdLabel.setText("");
                jTextArea.setText(oid+uid+sb.toString());
                sb.setLength(0);
            }
        });

    }

}
