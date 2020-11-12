package BehavioralPatterns.ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {

        Handler h1 = new FirstConcreteHandlers();
        Handler h2 = new TwoConcreteHandlers();
        Handler h3 = new ThreeConcreteHandlers();

        h1.setNext(h2);
        h2.setNext(h3);



        h1.handle("admin", "admin");

    }
}
