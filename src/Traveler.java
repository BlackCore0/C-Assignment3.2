import java.util.ArrayList;

public class Traveler {
    private Planet currentPlanet;
    private Planet destination;

    private Traveler(Planet currentPlanet, Planet destination) {
        this.currentPlanet = currentPlanet;
        this.destination = destination;
    }

    public void travelToDestination() {
        while (currentPlanet.getPlanetNumber() != destination.getPlanetNumber()) {


            getNeighbours();
            currentPlanet.getStarSystem().getNeighbourSystems();
            currentPlanet.getColor();
            currentPlanet.getPlanetNumber();

            printCurrentPlanet(currentPlanet);
        }

    }

    private ArrayList<Planet> getNeighbours() {
        ArrayList<Planet> planets = new ArrayList<>();
        for (int i = 0; i < currentPlanet.getNeighbours().size(); i++) {
            if (currentPlanet.getNeighbours().get(i) != 0) {
                planets.add(currentPlanet.getStarSystem().getPlanets().get(currentPlanet.getNeighbours().get(i)));
            }
        }
        return planets;
    }

    private void printCurrentPlanet(Planet planet) {
        System.out.println("StarSystem " + planet.getStarSystem().getSystemName() + ", Planet = [" + planet.getPlanetNumber() + "]");
    }
}
