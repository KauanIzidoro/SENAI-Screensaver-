import java.awt.*;
import java.util.Random;

public class Square extends  Rectangle {
    private int size;
    private Random r = new Random();
    public Square(int size){
        super(size,size);
        this.size = size;
    }

    public Square(){
        super();
        super.setHeight(super.getWidth());
    }

}
