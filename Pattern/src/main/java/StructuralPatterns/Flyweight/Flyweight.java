package StructuralPatterns.Flyweight;

public class Flyweight {

    private final String repeatingState;

    public void operation(int uniqueState){
        System.out.println("Repeating State = " + repeatingState + "\nUnique State = " + uniqueState);
    }

    public Flyweight(String repeatingState) {
        this.repeatingState = repeatingState;
    }
}
