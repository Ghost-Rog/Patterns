package GenerativePatterns.Builder;

public class CountryHouse {

    String wall;
    String basement;
    String ruff;

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public void setRuff(String ruff) {
        this.ruff = ruff;
    }

    @Override
    public String toString() {
        return "CountryHouse{" +
                "wall='" + wall + '\'' +
                ", basement='" + basement + '\'' +
                ", ruff='" + ruff + '\'' +
                '}';
    }
}
