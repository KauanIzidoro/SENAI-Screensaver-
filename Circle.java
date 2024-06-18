import java.awt.*;

public class Circle extends Rectangle{
    private int diameter;

    public Circle(int diameter){
        super(diameter,diameter);
        this.diameter=diameter;
    }
    public Circle(){
        super();
        super.setHeight(super.getWidth());
        this.diameter=super.getWidth();
    }

    @Override
    public void draw(Graphics g){
        g.setColor(super.getColor());
        g.fillOval(this.getX(),this.getY(),this.diameter,this.diameter);
    }
}
