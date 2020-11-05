package GenerativePatterns.Builder;

public class CityHouseBuilder implements HouseBuilder{

    private CityHouse cityHouse;

    @Override
    public void buildWall() {
        cityHouse.setWall("Городские стены");
    }

    @Override
    public void buildRuff() {
        cityHouse.setRuff("Городские крыша");
    }

    @Override
    public void buildBasement() {
        cityHouse.setBasement("Городские фундамент");
    }

    @Override
    public void reset() {
        cityHouse = new CityHouse();
    }

    public CityHouse getCityHouse() {
        return cityHouse;
    }
}
