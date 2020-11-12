package BehavioralPatterns.Observer;

public class NewsPaperOfFootball implements Subscriber{
    private final String name = "Football lover";
    @Override
    public void update(Publisher p) {
        if (p.getMainState().contains("Football")){
            System.out.println(name + " received "  + p.getMainState());
        }
    }
}
