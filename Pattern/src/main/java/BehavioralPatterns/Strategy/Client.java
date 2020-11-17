package BehavioralPatterns.Strategy;

public class Client {
    public static void main(String[] args) {

        RouteStrategy road = new RoadRouteStrategy();
        Navigator n = new Navigator(road);
        n.buildRoute(1,5);

        System.out.println("------------");

        new Navigator(new RoadRouteStrategy()).buildRoute(5,10);



        System.out.println("------------");
        RouteStrategy walk = new WalkingRouteStrategy();
        new Navigator(walk).buildRoute(10,20);
    }
}
