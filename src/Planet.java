import java.util.ArrayList;


/**
 * this class represents a Planet.
 */
public class Planet {
    private ArrayList<Integer> neighbours = new ArrayList<>();
    private int number;
    private String color;
    private StarSystem starSystem;

    /**
     * this is the constructor for this class, it will make sure the given attributes will correspond to the global
     * variables at the top of this class.
     * @param number is the number of this planet.
     * @param color is the color of this planet
     * @param neighbours is an arrayList of neighbours of this planet.
     * @param starSystem is the starSystem this planet is in.
     */
    public Planet(int number, String color, ArrayList<Integer> neighbours, StarSystem starSystem){
        this.starSystem = starSystem;
        this.neighbours = neighbours;
        this.number = number;
        this.color = color;
    }


    /**
     * this method will return an arrayList of neighbours of this planet.
     * @return an arrayList of neighbours of this planet.
     */
    public ArrayList<Integer> getNeighbours() {
        return neighbours;
    }


    /**
     * this method will return the number of this planet.
     * @return the number of this planet.
     */
    public int getPlanetNumber() {
        return number;
    }


    /**
     * this method will return the color of this planet.
     * @return the color of this planet.
     */
    public String getColor() {
        return color;
    }


    /**
     * this method will return the starSystem this planet is inside of.
     * @return the starSystem of this planet.
     */
    public StarSystem getStarSystem() {
        return starSystem;
    }
}
