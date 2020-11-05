package StructuralPatterns.Bridge;

public class AbstractionInteraction {

    private Os os;

    public AbstractionInteraction(Os os) {
        this.os = os;
    }

    void feature1(){
        os.openWindow();
        os.pushTheButton();
        os.createTable();
    }

    void feature2(){
        os.createTable();
    }
}
