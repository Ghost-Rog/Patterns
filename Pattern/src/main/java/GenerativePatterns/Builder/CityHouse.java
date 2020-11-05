package GenerativePatterns.Builder;

public class CityHouse {

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
        return "CityHouse{" +
                "wall='" + wall + '\'' +
                ", basement='" + basement + '\'' +
                ", ruff='" + ruff + '\'' +
                '}';
    }
}
