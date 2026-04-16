package Jared_Arnold;
import java.util.List;
import java.util.ArrayList;

public abstract class Drawing<T> {
    protected List<T> shapes = new ArrayList<>();


    public Drawing() {
       
    }

 
    public void addBasicShape(T shape) {
        if (shape != null) {
            shapes.add(shape);
        }
    }

    
     
    public List<T> getBasicShapes() {
        return new ArrayList<>(shapes);
    }


    public abstract void draw();
}
