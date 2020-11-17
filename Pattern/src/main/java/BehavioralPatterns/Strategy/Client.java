package BehavioralPatterns.Strategy;

public class Client {
    public static void main(String[] args) {

        RouteStrategy road = new RoadRouteStrategy();
        Navigator n = new Navigator();
        n.setRouteStrategy(road);
        n.buildRoute(1,5);

        System.out.println("------------");
        RouteStrategy walk = new WalkingRouteStrategy();
        n.setRouteStrategy(walk);
        n.buildRoute(5,10);
    }
}
