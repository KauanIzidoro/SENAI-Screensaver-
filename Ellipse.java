import java.awt.*;

public class Ellipse extends Rectangle {
    @Override
    public void draw(Graphics g){
        g.setColor(super.getColor());
        g.fillOval(super.getX(), super.getY(), super.getHeight(), super.getWidth());
    }
}
