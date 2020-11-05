package GenerativePatterns.AbstractFactory;

import GenerativePatterns.AbstractFactory.Chairs.Chair;
import GenerativePatterns.AbstractFactory.Factorys.AbstractFactory;
import GenerativePatterns.AbstractFactory.Tables.Table;

public class Client {

    private AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }

    public void construct() {
        Table table = factory.createProductTable();
        Chair chair = factory.createProductChair();
        System.out.println(table);
        System.out.println(chair);
    }

}
