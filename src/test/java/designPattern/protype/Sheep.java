package designPattern.protype;

public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep was born");
    }

    @Override
    public Animal createCopy() throws CloneNotSupportedException {
        System.out.println("Sheep was coped");

        return (Sheep) this.clone();
    }

    @Override
    public String toString() {
        return "Happy sheep says 'beeee'!";
    }
}
