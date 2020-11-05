package GenerativePatterns.AbstractFactory.Tables;


public class BraveTable extends Table {


    public BraveTable(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return name + " of brave table";
    }
}
