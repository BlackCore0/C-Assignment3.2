public class Traveler {
    private Planet currentPlanet;
    private Planet destination;

    private Traveler(Planet currentPlanet, Planet destination){
        this.currentPlanet = currentPlanet;
        this.destination = destination;
    }
    public void travelToDestination(){
        while (currentPlanet.getPlanetNumber()!=destination.getPlanetNumber()){

        }
    }

    private void printDestination(Planet planet){
        System.out.println("planet = [" + planet.getPlanetNumber() + "]");
    }
}
