package StructralPattern.CompositePattern;

public class App {
    public static void main(String[] args) {
        Human human = new Human();
        human.setDepartment("HR");
        human.setName("Mohit");

        Robot robot = new Robot();
        robot.setDepartment("Manufacturing");
        robot.setName("Anuj");

        WorkManager workManager = new WorkManager();
        workManager.add(human);
        workManager.add(robot);
        System.out.println(workManager);
    }
}
