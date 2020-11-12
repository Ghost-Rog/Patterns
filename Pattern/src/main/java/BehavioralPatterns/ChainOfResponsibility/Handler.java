package BehavioralPatterns.ChainOfResponsibility;

public interface Handler {

    void setNext(Handler h);

    void handle(String login, String password);
}
