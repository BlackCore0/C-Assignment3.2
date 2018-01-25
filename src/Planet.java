import java.util.ArrayList;

public class Planet {
    private ArrayList<Planet> neighbours = new ArrayList<>();
    private int number;
    private String color;
    private boolean travelerHere = false;
    public Planet(int number, String color,ArrayList<Planet> neighbours){
        this.neighbours = neighbours;
        this.number = number;
        this.color = color;
    }

    public ArrayList<Planet> getNeighbours() {
        return neighbours;
    }

    public int getPlanetNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public boolean isTravelerHere() {
        return travelerHere;
    }

    public void setTravelerHere(boolean travelerHere) {
        this.travelerHere = travelerHere;
    }


}
