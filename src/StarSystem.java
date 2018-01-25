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

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    public void setNeighbourSystems(ArrayList<StarSystem> neighbourSystems) {
        this.neighbourSystems = neighbourSystems;
    }

    public Planet getSpecificPlanet(int planetNumber){
        for (Planet planet:planets
             ) {
            if(planet.getPlanetNumber() == planetNumber){
                return planet;
            }
        }
        return null;
    }
}
