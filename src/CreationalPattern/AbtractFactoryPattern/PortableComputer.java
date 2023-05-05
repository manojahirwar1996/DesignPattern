package CreationalPattern.AbtractFactoryPattern;

public class PortableComputer extends AbstractFactory {
    @Override
    Computer getComputer(String ComputerType) {
        if (ComputerType.equalsIgnoreCase("Laptop")) {
            return new Laptop();
        } else if (ComputerType.equalsIgnoreCase("Phone")) {
            return new Phone();
        }
        return null;
    }
}
