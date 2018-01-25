import java.util.ArrayList;

public class StarSystem {
    public ArrayList<StarSystem> neighbourSystems = new ArrayList<>();
    private String systemName;
    private ArrayList<Planet> planets;
    public StarSystem(String systemName, ArrayList<Planet> planets){
        this.systemName = systemName;
        this.planets = planets;
    }

    public ArrayList<StarSystem> getNeighbourSystems() {
        return neighbourSystems;
    }

    public String getSystemName() {
        return systemName;
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }
}
