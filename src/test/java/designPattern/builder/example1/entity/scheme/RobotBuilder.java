package designPattern.builder.example1.entity.scheme;

import designPattern.builder.example1.entity.Robot;

public interface RobotBuilder {

    void buildHead();

    void buildTors();

    void buildArms();

    void buildLegs();

    Robot getRobot();
}
