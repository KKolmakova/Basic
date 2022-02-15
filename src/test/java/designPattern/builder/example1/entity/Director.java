package designPattern.builder.example1.entity;

import designPattern.builder.example1.entity.scheme.RobotBuilder;

public class Director {

    private final RobotBuilder robotBuilder;

    public Director(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot(){
        return robotBuilder.getRobot();
    }

    public void createRobot(){
        robotBuilder.buildHead();
        robotBuilder.buildTors();
        robotBuilder.buildLegs();
        robotBuilder.buildArms();
    }
}
