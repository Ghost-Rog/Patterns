package GenerativePatterns.AbstractFactory.Factorys;

import GenerativePatterns.AbstractFactory.Chairs.Chair;
import GenerativePatterns.AbstractFactory.Tables.Table;

public interface AbstractFactory {

    Chair createProductChair();
    Table createProductTable();

}
