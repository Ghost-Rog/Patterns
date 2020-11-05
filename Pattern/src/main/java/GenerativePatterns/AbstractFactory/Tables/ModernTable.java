package GenerativePatterns.AbstractFactory.Tables;


public class ModernTable extends Table {


    public ModernTable(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return name + " of modern table";
    }
}
