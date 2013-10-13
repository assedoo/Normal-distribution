package ua.net.assedo.normaldistribution;

/**
 * Created with IntelliJ IDEA.
 * User: assedoo@gmail.com
 * Project: second
 * Date: 10/12/13
 * Time: 5:13 PM
 */
public class Ball extends Entity {

    public Ball(int x,int y) {
        setCoordinates(new Coordinates(x,y));
    }

    public void right() {
        getCoordinates().incrementX();
    }

    public void left() {
        getCoordinates().decrementX();
    }

    public void up() {
        getCoordinates().incrementY();
    }

    public void down() {
        getCoordinates().decrementY();
    }

    public String toString() {
        return "Ball: " + super.toString();
    }
}
