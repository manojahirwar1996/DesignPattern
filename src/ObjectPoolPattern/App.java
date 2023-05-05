package ObjectPoolPattern;

import PrototypePattern.Robot;

public class App {
    public static void main(String[] args) {
        ObjectPool robotsPool = new RobotPool();
        Robot firstRobot = (Robot) robotsPool.create();
        Robot secondRobot = (Robot) robotsPool.create();
        robotsPool.checkedOut(firstRobot);
        Robot thirdRobot = (Robot) robotsPool.checkedIn();
    }
}
