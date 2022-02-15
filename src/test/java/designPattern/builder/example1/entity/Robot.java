package designPattern.builder.example1.entity;

import designPattern.builder.example1.entity.scheme.RobotScheme;

public class Robot implements RobotScheme {

    private String head;
    private String tors;
    private String arms;
    private String legs;

    @Override
    public void setRobotHead(String head) {
        this.head = head;
    }

    @Override
    public void setRobotTors(String tors) {
        this.tors = tors;
    }

    @Override
    public void setRobotArms(String arms) {
        this.arms = arms;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "head='" + head + '\'' +
                ", tors='" + tors + '\'' +
                ", arms='" + arms + '\'' +
                ", legs='" + legs + '\'' +
                '}';
    }
}
