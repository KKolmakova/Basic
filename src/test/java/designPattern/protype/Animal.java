package designPattern.protype;

public interface Animal extends Cloneable {

    Animal createCopy() throws CloneNotSupportedException;
}
