package StructuralPatterns.Flyweight;

public class Client {
    public static void main(String[] args) {

        FlyweightFactory ff = new FlyweightFactory();
        Context c = new Context(5,"Picture",ff);

        c.operation();

    }
}
