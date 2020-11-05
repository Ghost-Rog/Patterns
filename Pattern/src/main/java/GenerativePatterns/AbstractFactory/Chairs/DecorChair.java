package GenerativePatterns.AbstractFactory.Chairs;

public class DecorChair extends Chair {


    public DecorChair(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return name + " of decor style";
    }
}
