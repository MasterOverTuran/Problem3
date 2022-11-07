import java.awt.*;

public class Beech implements Tree {

    private final Point position;

    private double size;

    public Beech(Point position, double size) {
        this.position = position;
        this.size = size;
    }

    public void grow() {
        this.setSize(1);
    }

    public Color getColor() {
        return Color.CYAN;
    }

    public Point getPosition() {
        return position;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double amount) {
        this.size += amount;
    }
}