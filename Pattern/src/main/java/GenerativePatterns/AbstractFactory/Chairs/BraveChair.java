package GenerativePatterns.AbstractFactory.Chairs;

public class BraveChair extends Chair {


    public BraveChair(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return name + " of brave style";
    }
}
