package designPattern.proxy;

public class ProxyApplication {

    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();

        object.process();
        object.process();
    }
}
