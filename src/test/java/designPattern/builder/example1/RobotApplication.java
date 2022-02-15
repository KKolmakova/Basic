package designPattern.builder.example1;

import designPattern.builder.example1.entity.Director;
import designPattern.builder.example1.entity.Robot;
import designPattern.builder.example1.entity.scheme.RobotBuilder;
import designPattern.builder.example1.entity.RobotBuilderImpl;

public class RobotApplication {

    public static void main(String[] args) {
        RobotBuilder robotBuilder = new RobotBuilderImpl();

        Director director = new Director(robotBuilder);

        director.createRobot();

        Robot robot = director.getRobot();
        System.out.println(robot.toString());
    }
}
