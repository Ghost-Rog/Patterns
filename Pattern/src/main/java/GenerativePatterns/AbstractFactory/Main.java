package GenerativePatterns.AbstractFactory;

import GenerativePatterns.AbstractFactory.Factorys.BraveFactory;
import GenerativePatterns.AbstractFactory.Factorys.DecorFactory;
import GenerativePatterns.AbstractFactory.Factorys.ModernFactory;

public class Main {
    public static void main(String[] args) {

        Client client = new Client(new DecorFactory());
        client.construct();
        client.setFactory(new ModernFactory());
        client.construct();
        client.setFactory(new BraveFactory());
        client.construct();


    }
}
