import java.util.ArrayList;

/**
 * this class represents a Galaxy.
 */
public class Galaxy {

    private ArrayList<StarSystem> systems;


    /**
     * this is the constructor for this class, it will make sure the given attributes will correspond to the global
     * variables at the top of this class.
     * @param starSystems the starSystems of the galaxy.
     */
    public  Galaxy(ArrayList<StarSystem> starSystems){
        this.systems = starSystems;
    }


    /**
     * this is a getter for the starSystems.
     * @return the starSystems of this galaxy.
     */
    public ArrayList<StarSystem> getSystems(){
        return systems;
    }


    /**
     * this method takes the name of the starSystem and returns the correlated object.
     * @param systemName is the name of the system searched for.
     * @return the starSystem object searched for.
     */
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
