package BehavioralPatterns.Strategy;

public class Navigator {
    private RouteStrategy routeStrategy;

    public void buildRoute(int a, int b){
        routeStrategy.buildRoad(a, b);
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }


}
