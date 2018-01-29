import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        new main().run();
    }


    public static final String RED = "RED";
    public static final String BLUE = "BLUE";
    public static final String YELLOW = "YELLOW";
    public static final String GREEN = "GREEN";


    public void run() {
        Galaxy galaxy = buildGalaxy();
        Traveler traveler = new Traveler();

        Planet startingPlanet = setPlanet(galaxy, "K", 2);
        Planet destinationPlanet = setPlanet(galaxy, "D", 3);

        System.out.println(traveler.travelToDestination(startingPlanet, destinationPlanet));

//          //this is the not reachable version.
//        startingPlanet = setPlanet(galaxy, "H", 3);
//        destinationPlanet = setPlanet(galaxy, "A", 5);
//
//        System.out.println(traveler.travelToDestination(startingPlanet, destinationPlanet));
    }

    private Planet setPlanet(Galaxy galaxy, String systemName, int planetNumber) {
        Planet planet = galaxy.getSpecificSystem(systemName).getSpecificPlanet(planetNumber);
        return planet;
    }

    public Galaxy buildGalaxy() {

        ArrayList<ArrayList<Planet>> planetArrays = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            planetArrays.add(new ArrayList<Planet>());
        }

        ArrayList<StarSystem> starSystems = new ArrayList<>();


        starSystems.add(new StarSystem("A", planetArrays.get(0)));
        starSystems.add(new StarSystem("B", planetArrays.get(1)));
        starSystems.add(new StarSystem("C", planetArrays.get(2)));
        starSystems.add(new StarSystem("D", planetArrays.get(3)));
        starSystems.add(new StarSystem("E", planetArrays.get(4)));
        starSystems.add(new StarSystem("F", planetArrays.get(5)));
        starSystems.add(new StarSystem("G", planetArrays.get(6)));
        starSystems.add(new StarSystem("H", planetArrays.get(7)));
        starSystems.add(new StarSystem("K", planetArrays.get(8)));

        Galaxy myGalaxy = new Galaxy(starSystems);
        addPlanetsForSystem1(myGalaxy);
        addPlanetsForSystem2(myGalaxy);
        addPlanetsForSystem3(myGalaxy);
        addPlanetsForSystem4(myGalaxy);
        addPlanetsForSystem5(myGalaxy);
        addPlanetsForSystem6(myGalaxy);
        addPlanetsForSystem7(myGalaxy);
        addPlanetsForSystem8(myGalaxy);
        addPlanetsForSystem9(myGalaxy);


        ArrayList<StarSystem> neighbours = new ArrayList<>();
        neighbours.add(starSystems.get(1));
        neighbours.add(starSystems.get(2));
        neighbours.add(starSystems.get(3));
        myGalaxy.getSystems().get(0).setNeighbourSystems(neighbours);

        ArrayList<StarSystem> neighbours2 = new ArrayList<>();
        neighbours2.add(starSystems.get(0));
        neighbours2.add(starSystems.get(3));
        neighbours2.add(starSystems.get(8));
        myGalaxy.getSystems().get(1).setNeighbourSystems(neighbours2);

        ArrayList<StarSystem> neighbours3 = new ArrayList<>();
        neighbours3.add(starSystems.get(0));
        neighbours3.add(starSystems.get(3));
        neighbours3.add(starSystems.get(4));
        myGalaxy.getSystems().get(2).setNeighbourSystems(neighbours3);

        ArrayList<StarSystem> neighbours4 = new ArrayList<>();
        neighbours4.add(starSystems.get(0));
        neighbours4.add(starSystems.get(1));
        neighbours4.add(starSystems.get(2));
        neighbours4.add(starSystems.get(5));
        myGalaxy.getSystems().get(3).setNeighbourSystems(neighbours4);

        ArrayList<StarSystem> neighbours5 = new ArrayList<>();
        neighbours5.add(starSystems.get(2));
        neighbours5.add(starSystems.get(5));
        neighbours5.add(starSystems.get(6));
        myGalaxy.getSystems().get(4).setNeighbourSystems(neighbours5);

        ArrayList<StarSystem> neighbours6 = new ArrayList<>();
        neighbours6.add(starSystems.get(7));
        neighbours6.add(starSystems.get(3));
        neighbours6.add(starSystems.get(4));
        myGalaxy.getSystems().get(5).setNeighbourSystems(neighbours6);

        ArrayList<StarSystem> neighbours7 = new ArrayList<>();
        neighbours7.add(starSystems.get(7));
        neighbours7.add(starSystems.get(4));
        myGalaxy.getSystems().get(6).setNeighbourSystems(neighbours7);

        ArrayList<StarSystem> neighbours8 = new ArrayList<>();
        neighbours8.add(starSystems.get(5));
        neighbours8.add(starSystems.get(6));
        neighbours8.add(starSystems.get(8));
        myGalaxy.getSystems().get(7).setNeighbourSystems(neighbours8);

        ArrayList<StarSystem> neighbours9 = new ArrayList<>();
        neighbours9.add(starSystems.get(1));
        neighbours9.add(starSystems.get(7));
        myGalaxy.getSystems().get(8).setNeighbourSystems(neighbours9);

        return myGalaxy;
    }


    public void addPlanetsForSystem1(Galaxy galaxy) {
        StarSystem system1 = galaxy.getSystems().get(0);
        ArrayList<Integer> neighbours = new ArrayList<>();
        neighbours.add(2);
        neighbours.add(4);
        ArrayList<Planet> planets = new ArrayList<>();
        Planet planet1 = new Planet(1, RED, neighbours, system1);

        ArrayList<Integer> neighbours2 = new ArrayList<>();
        neighbours2.add(1);
        Planet planet2 = new Planet(2, BLUE, neighbours2, system1);

        ArrayList<Integer> neighbours3 = new ArrayList<>();
        neighbours3.add(6);
        Planet planet3 = new Planet(3, YELLOW, neighbours3, system1);

        ArrayList<Integer> neighbours4 = new ArrayList<>();
        neighbours4.add(1);
        Planet planet4 = new Planet(4, RED, neighbours4, system1);

        ArrayList<Integer> neighbours5 = new ArrayList<>();
        neighbours5.add(0);
        Planet planet5 = new Planet(5, RED, neighbours5, system1);

        ArrayList<Integer> neighbours6 = new ArrayList<>();
        neighbours6.add(1);
        neighbours6.add(9);
        Planet planet6 = new Planet(6, YELLOW, neighbours6, system1);

        ArrayList<Integer> neighbours7 = new ArrayList<>();
        neighbours7.add(8);
        Planet planet7 = new Planet(7, RED, neighbours7, system1);

        ArrayList<Integer> neighbours8 = new ArrayList<>();
        neighbours8.add(7);
        Planet planet8 = new Planet(8, RED, neighbours8, system1);

        ArrayList<Integer> neighbours9 = new ArrayList<>();
        neighbours9.add(6);
        Planet planet9 = new Planet(9, YELLOW, neighbours9, system1);

        planets.add(planet1);
        planets.add(planet2);
        planets.add(planet3);
        planets.add(planet4);
        planets.add(planet5);
        planets.add(planet6);
        planets.add(planet7);
        planets.add(planet8);
        planets.add(planet9);

        system1.setPlanets(planets);


    }

    public void addPlanetsForSystem2(Galaxy galaxy) {
        StarSystem system1 = galaxy.getSystems().get(1);
        ArrayList<Integer> neighbours = new ArrayList<>();
        neighbours.add(2);
        ArrayList<Planet> planets = new ArrayList<>();
        Planet planet1 = new Planet(1, RED, neighbours, system1);

        ArrayList<Integer> neighbours2 = new ArrayList<>();
        neighbours2.add(1);
        Planet planet2 = new Planet(2, RED, neighbours2, system1);

        ArrayList<Integer> neighbours3 = new ArrayList<>();
        neighbours3.add(0);
        Planet planet3 = new Planet(3, YELLOW, neighbours3, system1);

        ArrayList<Integer> neighbours4 = new ArrayList<>();
        neighbours4.add(0);
        Planet planet4 = new Planet(4, YELLOW, neighbours4, system1);

        ArrayList<Integer> neighbours5 = new ArrayList<>();
        neighbours5.add(6);
        Planet planet5 = new Planet(5, RED, neighbours5, system1);

        ArrayList<Integer> neighbours6 = new ArrayList<>();
        neighbours6.add(5);
        Planet planet6 = new Planet(6, RED, neighbours6, system1);

        ArrayList<Integer> neighbours7 = new ArrayList<>();
        neighbours7.add(0);
        Planet planet7 = new Planet(7, BLUE, neighbours7, system1);

        ArrayList<Integer> neighbours8 = new ArrayList<>();
        neighbours8.add(0);
        Planet planet8 = new Planet(8, RED, neighbours8, system1);

        ArrayList<Integer> neighbours9 = new ArrayList<>();
        neighbours9.add(0);
        Planet planet9 = new Planet(9, GREEN, neighbours9, system1);

        planets.add(planet1);
        planets.add(planet2);
        planets.add(planet3);
        planets.add(planet4);
        planets.add(planet5);
        planets.add(planet6);
        planets.add(planet7);
        planets.add(planet8);
        planets.add(planet9);

        system1.setPlanets(planets);

    }

    public void addPlanetsForSystem3(Galaxy galaxy) {
        StarSystem system1 = galaxy.getSystems().get(2);
        ArrayList<Integer> neighbours = new ArrayList<>();
        neighbours.add(2);
        neighbours.add(4);
        ArrayList<Planet> planets = new ArrayList<>();
        Planet planet1 = new Planet(1, RED, neighbours, system1);

        ArrayList<Integer> neighbours2 = new ArrayList<>();
        neighbours2.add(1);
        neighbours2.add(3);
        Planet planet2 = new Planet(2, RED, neighbours2, system1);

        ArrayList<Integer> neighbours3 = new ArrayList<>();
        neighbours3.add(2);
        Planet planet3 = new Planet(3, BLUE, neighbours3, system1);

        ArrayList<Integer> neighbours4 = new ArrayList<>();
        neighbours4.add(1);
        neighbours4.add(7);
        Planet planet4 = new Planet(4, RED, neighbours4, system1);

        ArrayList<Integer> neighbours5 = new ArrayList<>();
        neighbours5.add(6);
        neighbours5.add(8);
        Planet planet5 = new Planet(5, GREEN, neighbours5, system1);

        ArrayList<Integer> neighbours6 = new ArrayList<>();
        neighbours6.add(5);
        Planet planet6 = new Planet(6, BLUE, neighbours6, system1);

        ArrayList<Integer> neighbours7 = new ArrayList<>();
        neighbours7.add(4);
        Planet planet7 = new Planet(7, RED, neighbours7, system1);

        ArrayList<Integer> neighbours8 = new ArrayList<>();
        neighbours8.add(5);
        Planet planet8 = new Planet(8, GREEN, neighbours8, system1);

        ArrayList<Integer> neighbours9 = new ArrayList<>();
        neighbours9.add(0);
        Planet planet9 = new Planet(9, YELLOW, neighbours9, system1);

        planets.add(planet1);
        planets.add(planet2);
        planets.add(planet3);
        planets.add(planet4);
        planets.add(planet5);
        planets.add(planet6);
        planets.add(planet7);
        planets.add(planet8);
        planets.add(planet9);

        system1.setPlanets(planets);

    }

    public void addPlanetsForSystem4(Galaxy galaxy) {
        StarSystem system1 = galaxy.getSystems().get(3);
        ArrayList<Integer> neighbours = new ArrayList<>();
        neighbours.add(4);
        ArrayList<Planet> planets = new ArrayList<>();
        Planet planet1 = new Planet(1, BLUE, neighbours, system1);

        ArrayList<Integer> neighbours2 = new ArrayList<>();
        neighbours2.add(3);
        Planet planet2 = new Planet(2, BLUE, neighbours2, system1);

        ArrayList<Integer> neighbours3 = new ArrayList<>();
        neighbours3.add(2);
        Planet planet3 = new Planet(3, BLUE, neighbours3, system1);

        ArrayList<Integer> neighbours4 = new ArrayList<>();
        neighbours4.add(1);
        Planet planet4 = new Planet(4, BLUE, neighbours4, system1);

        ArrayList<Integer> neighbours5 = new ArrayList<>();
        neighbours5.add(0);
        Planet planet5 = new Planet(5, BLUE, neighbours5, system1);

        ArrayList<Integer> neighbours6 = new ArrayList<>();
        neighbours6.add(0);
        Planet planet6 = new Planet(6, BLUE, neighbours6, system1);

        ArrayList<Integer> neighbours7 = new ArrayList<>();
        neighbours7.add(0);
        Planet planet7 = new Planet(7, RED, neighbours7, system1);

        ArrayList<Integer> neighbours8 = new ArrayList<>();
        neighbours8.add(0);
        Planet planet8 = new Planet(8, RED, neighbours8, system1);

        ArrayList<Integer> neighbours9 = new ArrayList<>();
        neighbours9.add(0);
        Planet planet9 = new Planet(9, YELLOW, neighbours9, system1);

        planets.add(planet1);
        planets.add(planet2);
        planets.add(planet3);
        planets.add(planet4);
        planets.add(planet5);
        planets.add(planet6);
        planets.add(planet7);
        planets.add(planet8);
        planets.add(planet9);

        system1.setPlanets(planets);

    }

    public void addPlanetsForSystem5(Galaxy galaxy) {
        StarSystem system1 = galaxy.getSystems().get(4);
        ArrayList<Integer> neighbours = new ArrayList<>();
        neighbours.add(4);
        ArrayList<Planet> planets = new ArrayList<>();
        Planet planet1 = new Planet(1, GREEN, neighbours, system1);

        ArrayList<Integer> neighbours2 = new ArrayList<>();
        neighbours2.add(3);
        Planet planet2 = new Planet(2, GREEN, neighbours2, system1);

        ArrayList<Integer> neighbours3 = new ArrayList<>();
        neighbours3.add(2);
        Planet planet3 = new Planet(3, BLUE, neighbours3, system1);

        ArrayList<Integer> neighbours4 = new ArrayList<>();
        neighbours4.add(1);
        Planet planet4 = new Planet(4, RED, neighbours4, system1);

        ArrayList<Integer> neighbours5 = new ArrayList<>();
        neighbours5.add(6);
        Planet planet5 = new Planet(5, YELLOW, neighbours5, system1);

        ArrayList<Integer> neighbours6 = new ArrayList<>();
        neighbours6.add(5);
        neighbours6.add(9);
        Planet planet6 = new Planet(6, YELLOW, neighbours6, system1);

        ArrayList<Integer> neighbours7 = new ArrayList<>();
        neighbours7.add(8);
        Planet planet7 = new Planet(7, GREEN, neighbours7, system1);

        ArrayList<Integer> neighbours8 = new ArrayList<>();
        neighbours8.add(7);
        Planet planet8 = new Planet(8, GREEN, neighbours8, system1);

        ArrayList<Integer> neighbours9 = new ArrayList<>();
        neighbours9.add(6);
        Planet planet9 = new Planet(9, YELLOW, neighbours9, system1);

        planets.add(planet1);
        planets.add(planet2);
        planets.add(planet3);
        planets.add(planet4);
        planets.add(planet5);
        planets.add(planet6);
        planets.add(planet7);
        planets.add(planet8);
        planets.add(planet9);

        system1.setPlanets(planets);

    }

    public void addPlanetsForSystem6(Galaxy galaxy) {
        StarSystem system1 = galaxy.getSystems().get(5);
        ArrayList<Integer> neighbours = new ArrayList<>();
        neighbours.add(2);
        ArrayList<Planet> planets = new ArrayList<>();
        Planet planet1 = new Planet(1, BLUE, neighbours, system1);

        ArrayList<Integer> neighbours2 = new ArrayList<>();
        neighbours2.add(1);
        neighbours2.add(3);
        Planet planet2 = new Planet(2, BLUE, neighbours2, system1);

        ArrayList<Integer> neighbours3 = new ArrayList<>();
        neighbours3.add(2);
        neighbours3.add(6);
        Planet planet3 = new Planet(3, GREEN, neighbours3, system1);

        ArrayList<Integer> neighbours4 = new ArrayList<>();
        neighbours4.add(0);
        Planet planet4 = new Planet(4, RED, neighbours4, system1);

        ArrayList<Integer> neighbours5 = new ArrayList<>();
        neighbours5.add(0);
        Planet planet5 = new Planet(5, GREEN, neighbours5, system1);

        ArrayList<Integer> neighbours6 = new ArrayList<>();
        neighbours6.add(3);
        neighbours6.add(9);
        Planet planet6 = new Planet(6, GREEN, neighbours6, system1);

        ArrayList<Integer> neighbours7 = new ArrayList<>();
        neighbours7.add(8);
        Planet planet7 = new Planet(7, BLUE, neighbours7, system1);

        ArrayList<Integer> neighbours8 = new ArrayList<>();
        neighbours8.add(7);
        Planet planet8 = new Planet(8, GREEN, neighbours8, system1);

        ArrayList<Integer> neighbours9 = new ArrayList<>();
        neighbours9.add(6);
        Planet planet9 = new Planet(9, GREEN, neighbours9, system1);

        planets.add(planet1);
        planets.add(planet2);
        planets.add(planet3);
        planets.add(planet4);
        planets.add(planet5);
        planets.add(planet6);
        planets.add(planet7);
        planets.add(planet8);
        planets.add(planet9);

        system1.setPlanets(planets);

    }

    public void addPlanetsForSystem7(Galaxy galaxy) {
        StarSystem system1 = galaxy.getSystems().get(6);
        ArrayList<Integer> neighbours = new ArrayList<>();
        neighbours.add(0);
        ArrayList<Planet> planets = new ArrayList<>();
        Planet planet1 = new Planet(1, GREEN, neighbours, system1);

        ArrayList<Integer> neighbours2 = new ArrayList<>();
        neighbours2.add(3);
        Planet planet2 = new Planet(2, GREEN, neighbours2, system1);

        ArrayList<Integer> neighbours3 = new ArrayList<>();
        neighbours3.add(2);
        Planet planet3 = new Planet(3, GREEN, neighbours3, system1);

        ArrayList<Integer> neighbours4 = new ArrayList<>();
        neighbours4.add(5);
        Planet planet4 = new Planet(4, GREEN, neighbours4, system1);

        ArrayList<Integer> neighbours5 = new ArrayList<>();
        neighbours5.add(4);
        Planet planet5 = new Planet(5, YELLOW, neighbours5, system1);

        ArrayList<Integer> neighbours6 = new ArrayList<>();
        neighbours6.add(0);
        Planet planet6 = new Planet(6, GREEN, neighbours6, system1);

        ArrayList<Integer> neighbours7 = new ArrayList<>();
        neighbours7.add(0);
        Planet planet7 = new Planet(7, GREEN, neighbours7, system1);

        ArrayList<Integer> neighbours8 = new ArrayList<>();
        neighbours8.add(9);
        Planet planet8 = new Planet(8, YELLOW, neighbours8, system1);

        ArrayList<Integer> neighbours9 = new ArrayList<>();
        neighbours9.add(8);
        Planet planet9 = new Planet(9, YELLOW, neighbours9, system1);

        planets.add(planet1);
        planets.add(planet2);
        planets.add(planet3);
        planets.add(planet4);
        planets.add(planet5);
        planets.add(planet6);
        planets.add(planet7);
        planets.add(planet8);
        planets.add(planet9);

        system1.setPlanets(planets);

    }

    public void addPlanetsForSystem8(Galaxy galaxy) {
        StarSystem system1 = galaxy.getSystems().get(7);
        ArrayList<Integer> neighbours = new ArrayList<>();
        neighbours.add(2);
        ArrayList<Planet> planets = new ArrayList<>();
        Planet planet1 = new Planet(1, YELLOW, neighbours, system1);

        ArrayList<Integer> neighbours2 = new ArrayList<>();
        neighbours2.add(1);
        neighbours2.add(3);
        Planet planet2 = new Planet(2, YELLOW, neighbours2, system1);

        ArrayList<Integer> neighbours3 = new ArrayList<>();
        neighbours3.add(2);
        Planet planet3 = new Planet(3, YELLOW, neighbours3, system1);

        ArrayList<Integer> neighbours4 = new ArrayList<>();
        neighbours4.add(7);
        Planet planet4 = new Planet(4, YELLOW, neighbours4, system1);

        ArrayList<Integer> neighbours5 = new ArrayList<>();
        neighbours5.add(6);
        Planet planet5 = new Planet(5, GREEN, neighbours5, system1);

        ArrayList<Integer> neighbours6 = new ArrayList<>();
        neighbours6.add(5);
        Planet planet6 = new Planet(6, GREEN, neighbours6, system1);

        ArrayList<Integer> neighbours7 = new ArrayList<>();
        neighbours7.add(4);
        Planet planet7 = new Planet(7, YELLOW, neighbours7, system1);

        ArrayList<Integer> neighbours8 = new ArrayList<>();
        neighbours8.add(9);
        Planet planet8 = new Planet(8, YELLOW, neighbours8, system1);

        ArrayList<Integer> neighbours9 = new ArrayList<>();
        neighbours9.add(8);
        Planet planet9 = new Planet(9, BLUE, neighbours9, system1);

        planets.add(planet1);
        planets.add(planet2);
        planets.add(planet3);
        planets.add(planet4);
        planets.add(planet5);
        planets.add(planet6);
        planets.add(planet7);
        planets.add(planet8);
        planets.add(planet9);

        system1.setPlanets(planets);

    }

    public void addPlanetsForSystem9(Galaxy galaxy) {
        StarSystem system1 = galaxy.getSystems().get(8);
        ArrayList<Integer> neighbours = new ArrayList<>();
        neighbours.add(4);
        ArrayList<Planet> planets = new ArrayList<>();
        Planet planet1 = new Planet(1, YELLOW, neighbours, system1);

        ArrayList<Integer> neighbours2 = new ArrayList<>();
        neighbours2.add(0);
        Planet planet2 = new Planet(2, RED, neighbours2, system1);

        ArrayList<Integer> neighbours3 = new ArrayList<>();
        neighbours3.add(0);
        Planet planet3 = new Planet(3, YELLOW, neighbours3, system1);

        ArrayList<Integer> neighbours4 = new ArrayList<>();
        neighbours4.add(1);
        neighbours4.add(7);
        Planet planet4 = new Planet(4, YELLOW, neighbours4, system1);

        ArrayList<Integer> neighbours5 = new ArrayList<>();
        neighbours5.add(0);
        Planet planet5 = new Planet(5, GREEN, neighbours5, system1);

        ArrayList<Integer> neighbours6 = new ArrayList<>();
        neighbours6.add(0);
        Planet planet6 = new Planet(6, RED, neighbours6, system1);

        ArrayList<Integer> neighbours7 = new ArrayList<>();
        neighbours7.add(4);
        neighbours7.add(8);
        Planet planet7 = new Planet(7, YELLOW, neighbours7, system1);

        ArrayList<Integer> neighbours8 = new ArrayList<>();
        neighbours8.add(7);
        neighbours8.add(9);
        Planet planet8 = new Planet(8, BLUE, neighbours8, system1);

        ArrayList<Integer> neighbours9 = new ArrayList<>();
        neighbours9.add(8);
        Planet planet9 = new Planet(9, RED, neighbours9, system1);

        planets.add(planet1);
        planets.add(planet2);
        planets.add(planet3);
        planets.add(planet4);
        planets.add(planet5);
        planets.add(planet6);
        planets.add(planet7);
        planets.add(planet8);
        planets.add(planet9);

        system1.setPlanets(planets);

    }
}