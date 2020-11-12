package BehavioralPatterns.Observer;

public class NewsPaperOfMoto implements Subscriber{

    private final String name = "Moto lover";

    @Override
    public void update(Publisher p) {
        if (p.getMainState().contains("Moto")){
            System.out.println(name + " received "  + p.getMainState());
        }
    }
}
