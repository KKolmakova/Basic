package designPattern.builder.example1.entity;

import designPattern.builder.example1.entity.scheme.RobotBuilder;

public class RobotBuilderImpl implements RobotBuilder {

    private final Robot robot;

    public RobotBuilderImpl() {
        this.robot = new Robot();
    }

    @Override
    public void buildHead() {
        robot.setRobotHead("Tin head");
    }

    @Override
    public void buildTors() {
        robot.setRobotTors("Tin tors");
    }

    @Override
    public void buildArms() {
        robot.setRobotArms("Blowtorch arms");
    }

    @Override
    public void buildLegs() {
        robot.setRobotLegs("Roller skates");
    }

    @Override
    public Robot getRobot() {
        return robot ;
    }
}
