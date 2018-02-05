import java.util.ArrayList;


/**
 * this class does not need a constructor as we want to re-use the traveler so it can travel again.
 */
public class Traveler {
    private Planet destination;
    ArrayList<Planet> planetsTravelled = new ArrayList<>();

    /**
     * this method returns a String which makes the true or false into a more user friendly sentence.
     * @param startingPlanet is the planet the traveler starts.
     * @param destination is the planet the traveler needs to travel to.
     * @return
     */
    public String travelToDestination(Planet startingPlanet, Planet destination) {
        this.destination = destination;

        boolean route = getRoute(startingPlanet);

        if(route){
            return "\n\nDestination Reached";
        }
        else{
            return "\n\nDestination not Reachable";
        }
    }


    /**
     * this is a recursive method that determines the fastest route to the destination planet from the first planet
     * given.
     * @param planet is the planet given by the method call, it can vary which planet it will be. It can either be the
     * starting planet or the current planet that it checks.
     * @return true if the planet is reachable and return false if the planet is not reachable.
     */
    private boolean getRoute(Planet planet) {
        planetsTravelled.add(planet);
        System.out.println("\n\n*Currently on planet:" + planet.getStarSystem().getSystemName()+planet.getPlanetNumber());
        if (planet != destination) {
            ArrayList<Planet> neighbours = getDirectNeighbours(planet);
            System.out.println("Neighbours:");
            for (Planet p:neighbours
                    ) {
                System.out.println("planet = [" +p.getStarSystem().getSystemName()+ p.getPlanetNumber() + "]");
            }
            System.out.println("Checking planets:");
            for (Planet p : neighbours) {
                System.out.println("planet = [" +p.getStarSystem().getSystemName()+ p.getPlanetNumber() + "]");
                if (!planetsTravelled.contains(p)) {
                    boolean planetFound = getRoute(p);
                    if (planetFound) {
                        return true;
                    }
                }
                else{
                    System.out.println("planet = [" +p.getStarSystem().getSystemName()+ p.getPlanetNumber() + "] has already been visited");
                }
            }
            return false;


        }
        return true;
    }


    /**
     * this method returns the planets the traveler can travel to from the current planet.
     * @param planet is the current planet.
     * @return a list of planets which the traveler can possibly travel to from this planet.
     */
    private ArrayList<Planet> getDirectNeighbours(Planet planet) {
        ArrayList<Planet> planets = new ArrayList<>();
        ArrayList<StarSystem> neighbours = planet.getStarSystem().getNeighbourSystems();

        for (int i = 0; i < neighbours.size(); i++) {

            Planet p = neighbours.get(i).getSpecificPlanet(planet.getPlanetNumber());

            if (p.getColor().equals(planet.getColor())) {
                planets.add(p);

            }

        }

        for (int i = 0; i < planet.getNeighbours().size(); i++) {
            if (planet.getNeighbours().get(i) != 0) {
                planets.add(planet.getStarSystem().getSpecificPlanet(    planet.getNeighbours().get(i)     ));
            }
        }
        System.out.println("");
        return planets;
    }
}
