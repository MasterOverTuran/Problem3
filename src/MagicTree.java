import java.awt.*;

public class MagicTree implements Tree {

    private Point position;

    private double size;

    private int growthState = 0;

    public MagicTree(Point position, double size) {
        this.position = position;
        this.size = size;
    }

    public void grow() {
        if (ConstAndUtil.getRandomIntBetween(0, 10) < 1 || growthState == 15) {
            this.setPosition(ConstAndUtil.getLegalRandomPosition());
            this.setSize(-0.8);
            growthState = 0;
        } else {
            this.setSize(0.8);
            growthState++;
        }
    }

    public Color getColor() {
        return Color.MAGENTA;
    }

    private void setPosition(Point position) {
        this.position = position;
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