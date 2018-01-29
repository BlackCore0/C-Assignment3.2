import java.util.ArrayList;

public class Traveler {
    private Planet currentPlanet;
    private Planet destination;
    ArrayList<Planet> planetsTravelled = new ArrayList<>();
    ArrayList<ArrayList<Planet>> planetLists = new ArrayList<>();

    public Traveler(Planet currentPlanet, Planet destination) {
        this.currentPlanet = currentPlanet;
        this.destination = destination;
    }

    public boolean travelToDestination() {
        boolean route = getRoute(currentPlanet);

        return route;
    }

    private boolean getRoute(Planet planet) {
        planetsTravelled.add(planet);
        if (planet != destination) {
            ArrayList<Planet> neighbours = getDirectNeighbours(planet);
            for (Planet p : neighbours) {
                if (!planetsTravelled.contains(p)) {
                    boolean planetFound = getRoute(p);
                    if (planetFound) {
                        return true;
                    }
                }
            }
            return false;


        }
        return true;
    }


    private ArrayList<Planet> getDirectNeighbours(Planet planet) {
        ArrayList<Planet> planets = new ArrayList<>();

        for (int i = 0; i < planet.getStarSystem().getNeighbourSystems().size(); i++) {

            Planet p = planet.getStarSystem().getNeighbourSystems().get(i).getPlanets().get(planet.getPlanetNumber() - 1);

            if (p.getColor().equals(planet.getColor())) {
                planets.add(p);
            }

        }
        for (int i = 0; i < planet.getNeighbours().size(); i++) {
            if (planet.getNeighbours().get(i) != 0) {
                planets.add(planet.getStarSystem().getPlanets().get(planet.getNeighbours().get(i)));
            }
        }
        planetsTravelled.add(planet);

        return planets;
    }


    private void printCurrentPlanet(Planet planet) {
        System.out.println("StarSystem " + planet.getStarSystem().getSystemName() + ", Planet = [" + planet.getPlanetNumber() + "]");
    }
}
