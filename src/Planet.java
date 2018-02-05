import java.util.ArrayList;

public class Planet {
    private ArrayList<Integer> neighbours = new ArrayList<>();
    private int number;
    private String color;
    private StarSystem starSystem;
    public Planet(int number, String color, ArrayList<Integer> neighbours, StarSystem starSystem){
        this.starSystem = starSystem;
        this.neighbours = neighbours;
        this.number = number;
        this.color = color;
    }

    public ArrayList<Integer> getNeighbours() {
        return neighbours;
    }

    public int getPlanetNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public StarSystem getStarSystem() {
        return starSystem;
    }
}
