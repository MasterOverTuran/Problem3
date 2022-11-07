import java.awt.*;

public class Birch implements Tree {

    private final Point position;

    private double size;

    public Birch(Point position, double size) {
        this.position = position;
        this.size = size;
    }

    public void grow() {
        this.setSize(0.7);
    }

    public Color getColor() {
        return Color.GREEN;
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