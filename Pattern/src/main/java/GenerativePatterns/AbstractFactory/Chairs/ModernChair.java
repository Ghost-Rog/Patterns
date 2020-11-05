package GenerativePatterns.AbstractFactory.Chairs;

public class ModernChair extends Chair {


    public ModernChair(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return name + " of modern style";
    }
}
