package BehavioralPatterns.Observer;

import java.util.LinkedList;

public class Publisher {

    private final LinkedList<Subscriber> subscribers;
    private String mainState;

    public Publisher() {
        subscribers = new LinkedList<>();
    }

    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public String getMainState() {
        return mainState;
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    private void notifySubscribers() {
        for (Subscriber s : subscribers) {
            s.update(this);
        }
//        subscribers.forEach(x -> x.update(this));
    }

    public void receivedNewMagazine(String mainState) {
        this.mainState = mainState;
        notifySubscribers();
    }
}
