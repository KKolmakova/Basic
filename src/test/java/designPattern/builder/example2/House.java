package designPattern.builder.example2;

public class House {

    private String floor;
    private String walls;
    private String roof;
    private String windows;

    public House() {
    }

    public House(String floor, String walls, String roof, String windows) {
        this.floor = floor;
        this.walls = walls;
        this.roof = roof;
        this.windows = windows;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public static Builder builder() {
        return new House().new Builder();
    }

    public class Builder {

        public Builder() {
        }

        public Builder setFloor(String floor) {
            House.this.floor = floor;
            return this;
        }

        public Builder setWalls(String walls) {
            House.this.walls = walls;
            return this;
        }

        public Builder setRoof(String roof) {
            House.this.roof = roof;
            return this;
        }

        public Builder setWindows(String windows) {
            House.this.windows = windows;
            return this;
        }

        public House build(){
            return House.this;
        }
    }
}
