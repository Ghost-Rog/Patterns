package BehavioralPatterns.ChainOfResponsibility;

public class TwoConcreteHandlers extends BaseHandler{


    @Override
    public void handle(String login, String password) {
        super.handle(login, password);
    }

    public boolean canHandler(String login, String password){
        return login == null || login.equals("") || password == null || password.equals("");
    }
}
