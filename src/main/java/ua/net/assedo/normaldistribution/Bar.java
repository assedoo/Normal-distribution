package ua.net.assedo.normaldistribution;

/**
 * Created with IntelliJ IDEA.
 * User: assedoo@gmail.com
 * Project: second
 * Date: 10/12/13
 * Time: 6:45 PM
 */
public class Bar extends Entity {

    public Bar (int x,int y) {
        setCoordinates(new Coordinates(x,y));
    }

    public String toString() {
        return "Bar: " + super.toString();
    }
}
