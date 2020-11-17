package BehavioralPatterns.Strategy;

public class RoadRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoad(int a, int b) {
        System.out.println("Вы проехали от " + a + " до " + b);
    }
}
