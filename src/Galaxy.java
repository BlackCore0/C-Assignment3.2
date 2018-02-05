import java.util.ArrayList;

public class Galaxy {

    private ArrayList<StarSystem> systems;

    public  Galaxy(ArrayList<StarSystem> starSystems){
        this.systems = starSystems;
    }

    public ArrayList<StarSystem> getSystems(){
        return systems;
    }

    public StarSystem getSpecificSystem(String systemName){
        for (StarSystem system:systems
             ) {
            if (system.getSystemName().equals(systemName)){
                return system;
            }
        }
        //if all fails, return null to cause a nullPointer, which is handled in it's respective caller
        return null;
    }

}
