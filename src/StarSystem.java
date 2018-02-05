import java.util.ArrayList;

/**
 * this class represents a StarSystem.
 */
public class StarSystem {
    public ArrayList<StarSystem> neighbourSystems = new ArrayList<>();
    private String systemName;
    private ArrayList<Planet> planets;


    /**
     * this is the constructor for this class, it will make sure the given attributes will correspond to the global
     * variables at the top of this class.
     * @param systemName is the name of the system.
     * @param planets is a list of planets that are inside of this system.
     */
    public StarSystem(String systemName, ArrayList<Planet> planets){
        this.systemName = systemName;
        this.planets = planets;
    }

    /**
     * this method returns the neighbours of this system if called.
     * @return a list of neighbours.
     */
    public ArrayList<StarSystem> getNeighbourSystems() {
        return neighbourSystems;
    }


    /**
     * this method returns the name of this system if called.
     * @return the name of this system.
     */
    public String getSystemName() {
        return systemName;
    }


    /**
     * this method sets the planets for this starSystem one at a time.
     * @param planets is the planet that needs to be added.
     */
    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }


    /**
     * this method is used to set the neighbourSystems of all the StarSystems, as this is not possible in the
     * constructor.
     * @param neighbourSystems is another StarSystem that neighbours this one.
     */
    public void setNeighbourSystems(ArrayList<StarSystem> neighbourSystems) {
        this.neighbourSystems = neighbourSystems;
    }


    /**
     * this method takes a number and converts it into a planet object.
     * @param planetNumber the number of the planet searched for.
     * @return the planet object searched for.
     */
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
