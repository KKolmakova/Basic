package designPattern.builder.example2;

public class HouseApplication {

    public static void main(String[] args) {

        //creating house with all necessary data
        House houseCompleted = new House("Stone", "Brick", "Shingles", "Double glassing");

        System.out.println(houseCompleted);

        //creating house with some data part
        House houseUnderConstruction = House.builder()
                .setFloor("Wood")
                .setWalls("Bamboo")
                .build();

        System.out.println(houseUnderConstruction.toString());
    }
}
