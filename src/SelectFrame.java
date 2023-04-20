import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.util.ArrayList;
import java.util.List;

public class SelectFrame extends JFrame {
// This is the main method that starts the program. 
    public static void main(String[] args) {
        new SelectFrame(new OrderManagement()).setVisible(true);
    }
 // set the title of the window
    JLabel title = new JLabel("Digital Commerce System - Order Management");
// These are instance variables that define the various components of the GUI interface. 
// They include labels, text fields, a text area, and buttons, as well as a panel to hold them all.  
    JLabel jTLable = new JLabel("Order Summary");
    private JLabel jLabel1 = new JLabel("Enter OrderID: ");
    private JLabel jLabel2 = new JLabel("Enter CustomerID: ");
    private JLabel jLabel3 = new JLabel("Enter ProductName: ");
    private JTextField jTextField1 = new JTextField();
    private JTextField jTextField2 = new JTextField();
    private JTextField jTextField3 = new JTextField();
    JTextArea jTextArea = new JTextArea();
    private JButton btnGenerate = new JButton("Generate");
    private JButton btnRest = new JButton("Reset");
    private JPanel panel = new JPanel();

//constructor that takes an OrderManagement object as parameter
    public SelectFrame(OrderManagement orderms){
//set the position and size of the frame
        this.setBounds(400,150,800,500);
//set the layout of the panel to null
        panel.setLayout(null);
//set the font of the title label
        title.setFont(new Font("黑体",Font.ITALIC,20));
//set the position and size of the title label
        title.setBounds(160,0,500,50);
//set the position and size for jLabels and jTextFields,Bounds,jTextArea
        jLabel1.setBounds(0,50,130,50);
        jLabel2.setBounds(0,120,130,50);
        jLabel3.setBounds(0,190,130,50);

        jTextField1.setBounds(140,50,130,50);
        jTextField2.setBounds(140,120,130,50);
        jTextField3.setBounds(140,190,130,50);

        btnGenerate.setBounds(30,260,100,50);
        btnRest.setBounds(150,260,100,50);
        jTextArea.setBounds(280,110,500,400);
        jTextArea.setEditable(false);
        jTLable.setBounds(300,50,200,50);
// add all the components to the panel
        panel.add(title);
        panel.add(jTextArea);
        panel.add(jTLable);
        panel.add(jLabel1);
        panel.add(jLabel2);
        panel.add(jLabel3);
        panel.add(jTextField1);
        panel.add(jTextField2);
        panel.add(jTextField3);
        panel.add(btnGenerate);
        panel.add(btnRest);
        this.add(panel,null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        btnRest.addActionListener(new ActionListener() {
// Defines what should happen when the button is clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextArea.setText("");
            }
        });
        btnGenerate.addActionListener(new ActionListener() {
            //get orders
            List<Order> orders = orderms.getOrders();
            @Override
            public void actionPerformed(ActionEvent e) {

                StringBuffer sb = new StringBuffer();
            // Check if the Order ID text field is not empty
                if (!jTextField1.getText().equals("")){
            // Iterate through the list of orders and check if the order ID matches the input
                    for (int i = 0;i < orders.size();i++){
                        if (orders.get(i).getOrder_id() == Integer.parseInt(jTextField1.getText().toString())){
        
                            sb.append("order_id: "+ orders.get(i).getOrder_id()+"\n"+"user_id: "+ orders.get(i).getUser_id()+"\n"+orders.get(i).getDetail()+"\n");
                        }
                    }
                }else if (!jTextField2.getText().equals("")){
            // Iterate through the list of orders and check if the user ID matches the input
                    for (int i = 0;i < orders.size();i++){
                        if (orders.get(i).getUser_id() == Integer.parseInt(jTextField2.getText().toString())){
    
                            sb.append("order_id: "+ orders.get(i).getOrder_id()+"\n"+"user_id: "+ orders.get(i).getUser_id()+"\n"+orders.get(i).getDetail()+"\n");
                        }
                    }
                }else if (!jTextField3.getText().equals("")){
            // Iterate through the list of orders and check if the order details contain the input
                    for (int i = 0;i < orders.size();i++){
                        if (orders.get(i).getDetail().contains(jTextField3.getText().toString())){
    
                            sb.append("order_id: "+ orders.get(i).getOrder_id()+"\n"+"user_id: "+ orders.get(i).getUser_id()+"\n"+orders.get(i).getDetail()+"\n");
                        }
                    }
                }
        // Set the text of the textArea to the string buffer
                jTextArea.setText(sb.toString());
         // Clear the string buffer
                sb.setLength(0);

            }
        });
    }


}
