package StructuralPatterns.Flyweight;

public class Context {

    private int State;
    private Flyweight flyweight;
    private FlyweightFactory flyweightFactory;

    public Context(int state, Flyweight flyweight, FlyweightFactory flyweightFactory) {
        State = state;
        this.flyweight = flyweight;
        this.flyweightFactory = flyweightFactory;
    }

    void operation(){

    }
}
