package designPattern.protype;

public class AnimalApplication {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep shon = new Sheep();
        Sheep dolly = (Sheep) shon.createCopy();

        System.out.println(shon + ", Hash: " + System.identityHashCode(shon));
        System.out.println(dolly  + ", Hash: " + System.identityHashCode(dolly));
    }
}
