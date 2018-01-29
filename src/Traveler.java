import javax.print.attribute.standard.Destination;
import java.util.ArrayList;

public class Traveler {
    private Planet destination;
    ArrayList<Planet> planetsTravelled = new ArrayList<>();

    public Traveler() {
    }

    public String travelToDestination(Planet currentPlanet, Planet destination) {
        this.destination = destination;

        boolean route = getRoute(currentPlanet);

        if(route){
            return "\n\nDestination Reached";
        }
        else{
            return "\n\nDestination not Reachable";
        }
    }

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
