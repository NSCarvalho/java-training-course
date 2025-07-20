package classes;

import java.util.ArrayList;
import java.util.List;

public class OrderMain {
    public static void main(String[] args) {

       Order order = new Order();
       //order.addItem(order.new Item(1, 10, "Car") );
       //order.addItem(order.new Item(2, 15, "House") );

        order.addItem(1, 10, "Car");
        order.addItem(2, 15, "House");

        order.closed();
        Order.Bill bill = order.createBill();
    }
}
