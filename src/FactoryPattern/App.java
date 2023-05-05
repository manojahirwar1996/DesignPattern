package FactoryPattern;

public class App {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        Computer computer1 = computerFactory.getComputer("Phone");
        computer1.compute();

        Computer computer2 = computerFactory.getComputer("SmartTV");
        computer2.compute();
        Computer computer3 = computerFactory.getComputer("Laptop");
        computer3.compute();
    }
}
