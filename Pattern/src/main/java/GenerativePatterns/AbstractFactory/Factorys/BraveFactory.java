package GenerativePatterns.AbstractFactory.Factorys;

import GenerativePatterns.AbstractFactory.Chairs.BraveChair;
import GenerativePatterns.AbstractFactory.Chairs.Chair;
import GenerativePatterns.AbstractFactory.Tables.BraveTable;
import GenerativePatterns.AbstractFactory.Tables.Table;

public class BraveFactory implements AbstractFactory{
    @Override
    public Chair createProductChair() {
        return new BraveChair("стул2");
    }

    @Override
    public Table createProductTable() {
        return new BraveTable("стол2");
    }
}
