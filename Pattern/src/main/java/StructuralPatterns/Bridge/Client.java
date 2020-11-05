package StructuralPatterns.Bridge;

public class Client {
    public static void main(String[] args) {

        AbstractionInteraction a = new AbstractionInteraction(new Linux());
        a.feature1();

    }
}
