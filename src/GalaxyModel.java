public class GalaxyModel {
    private static GalaxyModel ourInstance = new GalaxyModel();

    public static GalaxyModel getInstance() {
        return ourInstance;
    }

    private GalaxyModel() {

    }
}
