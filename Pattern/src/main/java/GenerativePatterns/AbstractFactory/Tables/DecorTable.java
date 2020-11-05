package GenerativePatterns.AbstractFactory.Tables;


public class DecorTable extends Table {


    public DecorTable(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return name + " of decor table";
    }
}
