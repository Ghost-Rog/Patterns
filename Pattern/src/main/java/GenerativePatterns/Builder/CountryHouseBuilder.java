package GenerativePatterns.Builder;

public class CountryHouseBuilder implements HouseBuilder{

    private CountryHouse countryHouse;

    @Override
    public void buildWall() {
        countryHouse.setWall("Сельские стены");
    }

    @Override
    public void buildRuff() {
        countryHouse.setRuff("Сельская крыша");
    }

    @Override
    public void buildBasement() {
        countryHouse.setBasement("Сельские фундамент");
    }

    @Override
    public void reset() {
        countryHouse = new CountryHouse();
    }

    public CountryHouse getCountryHouse() {
        return countryHouse;
    }
}
