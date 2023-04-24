# AnOrderManagement:dizzy:


:star2:System Overview:star2:

The system simulate the customer ordering process, and based on the customer’s orders to simulate order searching process.

:star2:Functional Specification:star2:


When the program is run, two GUI interfaces (based on java swing) are generated：


（1）Customer Ordering System :writing_hand:



![image](https://user-images.githubusercontent.com/130510998/233490835-2ef9305d-3387-4844-82cf-dc44773720a5.png)

 


1.This interface includes three labels: Product category, Price, and Quantity. 

2.When the user enters the purchase quantity and clicks submit button, the customer order details will be displayed in the PrintArea on the right.


（2）Order Management :writing_hand:

![image](https://user-images.githubusercontent.com/130510998/233491445-f716ce42-747b-46ae-9ba7-abffb767a72b.png)



1.It allows users to search for details of the corresponding order by order ID, customer ID, or product name and display them in the Order Summary on the right. 

2.Theoretically, only one method should be used for the search. If the user enters more than one type of information (such as entering both the order ID and product name), the search should only be performed according to one method, with the search priority being order ID, customer ID, and product name.









