package BehavioralPatterns.ChainOfResponsibility;

public abstract class BaseHandler implements Handler {

    private Handler next;


    @Override
    public void setNext(Handler h) {
        next = h;
    }

    @Override
    public void handle(String login, String password) {
        if (next != null) {
            next.handle(login, password);
        }
    }
}
