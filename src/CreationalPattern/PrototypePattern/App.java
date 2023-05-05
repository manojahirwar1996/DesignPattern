package CreationalPattern.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> features = new ArrayList<String>();
        features.add("Start up");
        features.add("Perform task");
        features.add("Shutdown");
        Components components = new Components();

        components.setName("Infrared Goggles");
        components.setFunctionality("Read temprature of objects");

        Robot robot = new Robot(23, features, components);
        Robot anotherRobot = robot.clone();

        System.out.println(robot.getId());
        System.out.println(robot.getComponents());
        System.out.println(robot.getFeature());
        System.out.println(anotherRobot.getId());
        System.out.println(anotherRobot.getComponents());
        System.out.println(anotherRobot.getFeature());
    }
}
