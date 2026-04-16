package Jared_Arnold;

public class AdapterMain {
    public AdapterMain() {
        
    }

  
    public static void main(String[] args) {
     
        ShapeDrawer shapeDrawer = new ShapeDrawer();

      
        Rectangle visibleRect1 = new Rectangle();
        shapeDrawer.addBasicShape(visibleRect1);

       
        Rectangle hiddenRect = new Rectangle();
        hiddenRect.changeVisibility();
        shapeDrawer.addBasicShape(hiddenRect);

      
        Circle visibleCircle = new Circle();
        shapeDrawer.addBasicShape(visibleCircle);

        Circle hiddenCircle = new Circle();
        hiddenCircle.changeVisibility();
        shapeDrawer.addBasicShape(hiddenCircle);

       
        Rectangle visibleRect2 = new Rectangle();
        shapeDrawer.addBasicShape(visibleRect2);

       
        shapeDrawer.draw();

        
        System.out.println(); // 输出空行分隔，增强可读性
        shapeDrawer.grow();

        
        System.out.println(); 
        shapeDrawer.showVisibility();
    }
}
