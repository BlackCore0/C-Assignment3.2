import java.util.ArrayList;

public class Galaxy {
    private ArrayList<StarSystem> systems;
    public  Galaxy(ArrayList<StarSystem> starSystems){
        this.systems = starSystems;
    }

    public ArrayList<StarSystem> getSystems() {
        return systems;
    }

}
