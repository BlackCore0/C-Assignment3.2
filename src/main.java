import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        new main().run();
    }


    public static final String RED = "RED";
    public static final String BLUE = "BLUE";
    public static final String YELLOW = "YELLOW";
    public static final String GREEN = "GREEN";


    public void run(){
        Galaxy galaxy = buildGalaxy();

        Planet startingPlanet = galaxy.getSpecificSystem("K").getSpecificPlanet(2);
        Planet destinationPlanet = galaxy.getSpecificSystem("D").getSpecificPlanet(3);

        Traveler traveler = new Traveler(startingPlanet,destinationPlanet);

        System.out.println(traveler.travelToDestination());
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

        neighbours.clear();
        neighbours.add(starSystems.get(0));
        neighbours.add(starSystems.get(3));
        neighbours.add(starSystems.get(8));
        myGalaxy.getSystems().get(1).setNeighbourSystems(neighbours);

        neighbours.clear();
        neighbours.add(starSystems.get(0));
        neighbours.add(starSystems.get(3));
        neighbours.add(starSystems.get(4));
        myGalaxy.getSystems().get(2).setNeighbourSystems(neighbours);

        neighbours.clear();
        neighbours.add(starSystems.get(0));
        neighbours.add(starSystems.get(1));
        neighbours.add(starSystems.get(2));
        neighbours.add(starSystems.get(5));
        myGalaxy.getSystems().get(3).setNeighbourSystems(neighbours);

        neighbours.clear();
        neighbours.add(starSystems.get(2));
        neighbours.add(starSystems.get(5));
        neighbours.add(starSystems.get(6));
        myGalaxy.getSystems().get(4).setNeighbourSystems(neighbours);

        neighbours.clear();
        neighbours.add(starSystems.get(7));
        neighbours.add(starSystems.get(3));
        neighbours.add(starSystems.get(4));
        myGalaxy.getSystems().get(5).setNeighbourSystems(neighbours);

        neighbours.clear();
        neighbours.add(starSystems.get(7));
        neighbours.add(starSystems.get(4));
        myGalaxy.getSystems().get(6).setNeighbourSystems(neighbours);

        neighbours.clear();
        neighbours.add(starSystems.get(5));
        neighbours.add(starSystems.get(6));
        neighbours.add(starSystems.get(8));
        myGalaxy.getSystems().get(7).setNeighbourSystems(neighbours);

        neighbours.clear();
        neighbours.add(starSystems.get(1));
        neighbours.add(starSystems.get(7));
        myGalaxy.getSystems().get(8).setNeighbourSystems(neighbours);

        return myGalaxy;
    }


    public void addPlanetsForSystem1(Galaxy galaxy) {
        StarSystem system1 = galaxy.getSystems().get(0);
        ArrayList<Integer> neighbours = new ArrayList<>();
        neighbours.add(2);
        neighbours.add(4);
        ArrayList<Planet> planets = new ArrayList<>();
        Planet planet1 = new Planet(1,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(1);
        Planet planet2 = new Planet(2,BLUE,neighbours,system1);

        neighbours.clear();
        neighbours.add(6);
        Planet planet3 = new Planet(3,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(1);
        Planet planet4 = new Planet(4,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet5 = new Planet(5,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(1);
        neighbours.add(9);
        Planet planet6 = new Planet(6,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(8);
        Planet planet7 = new Planet(7,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(7);
        Planet planet8 = new Planet(8,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(6);
        Planet planet9 = new Planet(9,YELLOW,neighbours,system1);

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
        Planet planet1 = new Planet(1,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(1);
        Planet planet2 = new Planet(2,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet3 = new Planet(3,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet4 = new Planet(4,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(6);
        Planet planet5 = new Planet(5,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(5);
        Planet planet6 = new Planet(6,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet7 = new Planet(7,BLUE,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet8 = new Planet(8,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet9 = new Planet(9,GREEN,neighbours,system1);

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
        Planet planet1 = new Planet(1,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(1);
        neighbours.add(3);
        Planet planet2 = new Planet(2,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(2);
        Planet planet3 = new Planet(3,BLUE,neighbours,system1);

        neighbours.clear();
        neighbours.add(1);
        neighbours.add(7);
        Planet planet4 = new Planet(4,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(6);
        neighbours.add(8);
        Planet planet5 = new Planet(5,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(5);
        Planet planet6 = new Planet(6,BLUE,neighbours,system1);

        neighbours.clear();
        neighbours.add(4);
        Planet planet7 = new Planet(7,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(5);
        Planet planet8 = new Planet(8,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet9 = new Planet(9,YELLOW,neighbours,system1);

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
        Planet planet1 = new Planet(1,BLUE,neighbours,system1);

        neighbours.clear();
        neighbours.add(3);
        Planet planet2 = new Planet(2,BLUE,neighbours,system1);

        neighbours.clear();
        neighbours.add(2);
        Planet planet3 = new Planet(3,BLUE,neighbours,system1);

        neighbours.clear();
        neighbours.add(1);
        Planet planet4 = new Planet(4,BLUE,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet5 = new Planet(5,BLUE,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet6 = new Planet(6,BLUE,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet7 = new Planet(7,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet8 = new Planet(8,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet9 = new Planet(9,YELLOW,neighbours,system1);

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
        Planet planet1 = new Planet(1,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(3);
        Planet planet2 = new Planet(2,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(2);
        Planet planet3 = new Planet(3,BLUE,neighbours,system1);

        neighbours.clear();
        neighbours.add(1);
        Planet planet4 = new Planet(4,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(6);
        Planet planet5 = new Planet(5,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(5);
        neighbours.add(9);
        Planet planet6 = new Planet(6,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(8);
        Planet planet7 = new Planet(7,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(7);
        Planet planet8 = new Planet(8,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(6);
        Planet planet9 = new Planet(9,YELLOW,neighbours,system1);

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
        Planet planet1 = new Planet(1,BLUE,neighbours,system1);

        neighbours.clear();
        neighbours.add(1);
        neighbours.add(3);
        Planet planet2 = new Planet(2,BLUE,neighbours,system1);

        neighbours.clear();
        neighbours.add(2);
        neighbours.add(6);
        Planet planet3 = new Planet(3,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet4 = new Planet(4,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet5 = new Planet(5,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(3);
        neighbours.add(9);
        Planet planet6 = new Planet(6,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(8);
        Planet planet7 = new Planet(7,BLUE,neighbours,system1);

        neighbours.clear();
        neighbours.add(7);
        Planet planet8 = new Planet(8,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(6);
        Planet planet9 = new Planet(9,GREEN,neighbours,system1);

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
        Planet planet1 = new Planet(1,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(3);
        Planet planet2 = new Planet(2,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(2);
        Planet planet3 = new Planet(3,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(5);
        Planet planet4 = new Planet(4,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(4);
        Planet planet5 = new Planet(5,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet6 = new Planet(6,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet7 = new Planet(7,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(9);
        Planet planet8 = new Planet(8,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(8);
        Planet planet9 = new Planet(9,YELLOW,neighbours,system1);

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
        Planet planet1 = new Planet(1,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(1);
        neighbours.add(3);
        Planet planet2 = new Planet(2,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(2);
        Planet planet3 = new Planet(3,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(7);
        Planet planet4 = new Planet(4,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(6);
        Planet planet5 = new Planet(5,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(5);
        Planet planet6 = new Planet(6,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(4);
        Planet planet7 = new Planet(7,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(9);
        Planet planet8 = new Planet(8,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(8);
        Planet planet9 = new Planet(9,BLUE,neighbours,system1);

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
        Planet planet1 = new Planet(1,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet2 = new Planet(2,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet3 = new Planet(3,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(1);
        neighbours.add(7);
        Planet planet4 = new Planet(4,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet5 = new Planet(5,GREEN,neighbours,system1);

        neighbours.clear();
        neighbours.add(0);
        Planet planet6 = new Planet(6,RED,neighbours,system1);

        neighbours.clear();
        neighbours.add(4);
        neighbours.add(8);
        Planet planet7 = new Planet(7,YELLOW,neighbours,system1);

        neighbours.clear();
        neighbours.add(7);
        neighbours.add(9);
        Planet planet8 = new Planet(8,BLUE,neighbours,system1);

        neighbours.clear();
        neighbours.add(8);
        Planet planet9 = new Planet(9,RED,neighbours,system1);

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