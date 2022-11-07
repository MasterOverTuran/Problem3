import java.awt.*;

public class Spruce implements Tree {

    private final Point position;

    private double size;

    public Spruce(Point position, double size) {
        this.position = position;
        this.size = size;
    }

    public void grow() {
        this.setSize(0.5);
    }

    public Color getColor() {
        return Color.BLUE;
    }

    public Point getPosition() {
        return position;
    }

    public void setSize(double amount) {
        this.size += amount;
    }

    public double getSize() {
        return size;
    }
}