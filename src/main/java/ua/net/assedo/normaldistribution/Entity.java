package ua.net.assedo.normaldistribution;

/**
 * Created with IntelliJ IDEA.
 * User: assedoo@gmail.com
 * Project: second
 * Date: 10/12/13
 * Time: 6:46 PM
 */
public class Entity {

    private Coordinates coordinates;

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public String toString() {
        return "coordinates: " + coordinates;
    }
}
