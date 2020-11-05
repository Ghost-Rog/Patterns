package GenerativePatterns.Builder;

public class Client {
    public static void main(String[] args) {

        CityHouseBuilder cityHouseBuilder = new CityHouseBuilder();

        Director director = new Director(cityHouseBuilder);

        director.make("simple");

        CityHouse house = cityHouseBuilder.getCityHouse();
        System.out.println(house);
    }
}
