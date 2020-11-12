package BehavioralPatterns.Observer;

public class Client {
    public static void main(String[] args) {


        Subscriber subscriber = new NewsPaperOfMoto();
        Publisher publisher = new Publisher();
        publisher.subscribe(subscriber);
        publisher.receivedNewMagazine("Moto");

    }
}
