package AbtractFactoryPattern;

public class App {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory(true);
        //  ComputerFactory computerFactory = new ComputerFactory();
        Computer computer1 = abstractFactory.getComputer("Phone");
        computer1.compute();

        Computer computer2 = abstractFactory.getComputer("SmartTV");
        computer2.compute();
        Computer computer3 = abstractFactory.getComputer("Laptop");
        computer3.compute();
    }
}
