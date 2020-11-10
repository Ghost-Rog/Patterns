package StructuralPatterns.Flyweight;

public class Context {

    private final int uniqueState; //поле/объект которое не надо кэшировать
    private final Flyweight flyweight; //поле/объект для кэширования
    private FlyweightFactory flyweightFactory; //factory для генерации объекта //лучше отставить для расширения класса

    public Context(int uniqueState, String repeatingState, FlyweightFactory flyweightFactory) {
        this.uniqueState = uniqueState;
        this.flyweight = flyweightFactory.getFlyweight(repeatingState);
        this.flyweightFactory = flyweightFactory;
    }

    void operation(){
        flyweight.operation(uniqueState);
    }
}
