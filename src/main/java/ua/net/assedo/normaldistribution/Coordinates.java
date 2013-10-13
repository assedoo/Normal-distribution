package ua.net.assedo.normaldistribution;

/**
 * Created with IntelliJ IDEA.
 * User: assedoo@gmail.com
 * Project: second
 * Date: 10/12/13
 * Time: 5:17 PM
 */
public class Coordinates {

    private int x;
    private int y;

    public Coordinates() {
        setX(0);
        setY(0);
    }

    public Coordinates(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void incrementX() {
        x++;
    }

    public void decrementX() {
        x--;
    }

    public void incrementY() {
        y++;
    }

    public void decrementY() {
        y--;
    }

    public String toString() {
        return "X: "+x+"; Y:"+y;
    }

    public boolean equals(Coordinates coordinates) {
        return x == coordinates.getX() && y == coordinates.getY();
    }
}
