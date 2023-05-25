package StructralPattern.FlyWeightPattern;

public class Client {
    public static void main(String[] args) {
        InventoryBackend inventoryBackend = new InventoryBackend();
        inventoryBackend.takeOrder("iphone", 1);
        inventoryBackend.takeOrder("Laptop", 2);
        inventoryBackend.takeOrder("smartTv", 3);
        inventoryBackend.takeOrder("iphone", 4);
        inventoryBackend.takeOrder("iphone", 5);
        inventoryBackend.takeOrder("iphone", 6);
        inventoryBackend.process();
        System.out.println(inventoryBackend.report());


    }
}
