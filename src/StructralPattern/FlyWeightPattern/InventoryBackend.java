package StructralPattern.FlyWeightPattern;

import java.util.ArrayList;
import java.util.List;

public class InventoryBackend {
    private final  Market market =new Market();;
    private final List<Order> orders = new ArrayList<>();
    void takeOrder(String productName, long orderNumber){
        Product product = market.lookUp(productName);
        Order order = new Order(product ,orderNumber );
        orders.add(order);
    }
   synchronized void process(){
        for(Order order: orders){
            order.manageOrder();
        }
   }

   String report(){
        return "The total number order of created " + market.getSizeOfProducts();
   }
}
