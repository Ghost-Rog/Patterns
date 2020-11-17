package BehavioralPatterns.Strategy;

public class WalkingRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoad(int a, int b) {
        System.out.println("Вы прошли от " + a + " до " + b);
    }
}
