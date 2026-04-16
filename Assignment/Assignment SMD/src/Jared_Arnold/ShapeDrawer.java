package Jared_Arnold;
import java.util.List;

public class ShapeDrawer extends Drawing<ShapeBasic>{
    public ShapeDrawer() {
        super();
    }


    @Override
    public void draw() {
        List<ShapeBasic> shapes = getBasicShapes();
        if (shapes.isEmpty()) {
            System.out.println("Drawing is empty!");
            return;
        }
        for (ShapeBasic shape : shapes) {
            shape.draw();
        }
    }

 
    public void grow() {
        List<ShapeBasic> shapes = getBasicShapes();
        if (shapes.isEmpty()) {
            System.out.println("Drawing is empty!");
            return;
        }
        for (ShapeBasic shape : shapes) {
            shape.grow();
        }
    }


    public void showVisibility() {
        List<ShapeBasic> shapes = getBasicShapes();
        if (shapes.isEmpty()) {
            System.out.println("Drawing is empty!");
            return;
        }
        int index = 1;
        for (ShapeBasic shape : shapes) {
      
            String visibilityStatus = shape.isVisible() ? "is visible" : "is in the background";
        
            String shapeType = shape.printText();
        
            System.out.printf("%d. shape %s: %s%n", index, visibilityStatus, shapeType);
            index++;
        }
        
        System.out.printf("%nTotal number of shapes: %d%n", shapes.size());
    }
}
