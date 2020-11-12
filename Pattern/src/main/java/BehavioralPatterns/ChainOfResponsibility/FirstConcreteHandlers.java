package BehavioralPatterns.ChainOfResponsibility;

public class FirstConcreteHandlers extends BaseHandler {

    @Override
    public void handle(String login, String password) {
        if (canHandler(login, password)) {
            System.out.println("Accepted!");
        } else {
            System.out.println("Accept denied!");
            super.handle(login, password);
        }
    }

    public boolean canHandler(String login, String password) {
        return !login.isEmpty() && !password.isEmpty();
    }
}
