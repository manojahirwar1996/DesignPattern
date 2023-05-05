package ObjectPoolPattern;

import PrototypePattern.Components;
import PrototypePattern.Robot;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RobotPool extends ObjectPool{

    @Override
    public Object create() {
        int robotInt = ThreadLocalRandom.current().nextInt();
        Robot robot = new Robot(robotInt, new ArrayList<>(),new Components());
        return robot;
    }
}
