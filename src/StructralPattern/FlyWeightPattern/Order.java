package StructralPattern.FlyWeightPattern;

public class Order {
    private final Product product;
    private final long orderNumber;

    public Order(Product product, long orderNumber) {
        this.product = product;
        this.orderNumber = orderNumber;
    }
    void manageOrder(){
        System.out.println("Order Number : " + orderNumber + "contains: " + product);
    }

}
