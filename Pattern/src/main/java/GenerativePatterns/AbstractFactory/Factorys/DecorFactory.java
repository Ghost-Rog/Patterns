package GenerativePatterns.AbstractFactory.Factorys;

import GenerativePatterns.AbstractFactory.Chairs.Chair;
import GenerativePatterns.AbstractFactory.Chairs.DecorChair;
import GenerativePatterns.AbstractFactory.Tables.DecorTable;
import GenerativePatterns.AbstractFactory.Tables.Table;

public class DecorFactory implements AbstractFactory{
    public Chair createProductChair() {
        return new DecorChair("стул1");
    }

    public Table createProductTable() {
        return new DecorTable("стол1");
    }
}
