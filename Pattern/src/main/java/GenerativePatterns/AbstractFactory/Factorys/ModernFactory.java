package GenerativePatterns.AbstractFactory.Factorys;

import GenerativePatterns.AbstractFactory.Chairs.Chair;
import GenerativePatterns.AbstractFactory.Chairs.ModernChair;
import GenerativePatterns.AbstractFactory.Tables.ModernTable;
import GenerativePatterns.AbstractFactory.Tables.Table;

public class ModernFactory implements AbstractFactory{

    public Chair createProductChair() {
        return new ModernChair("стул3");
    }

    public Table createProductTable() {
        return new ModernTable("стол3");
    }
}
