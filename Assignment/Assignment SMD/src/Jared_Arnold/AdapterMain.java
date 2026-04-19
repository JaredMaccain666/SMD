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


        Triangle t1 = new Triangle(3.0, 3.0, 3.0);
        t1.setColor("Other color");
        shapeDrawer.addBasicShape(new ShapeAdapter(t1));


        ShapeDiamond d1 = new ShapeDiamond(4.0, 4.0);
        d1.setColor("Blue");
        shapeDrawer.addBasicShape(new ShapeAdapter(d1));


        ShapeDiamond d2 = new ShapeDiamond(4.0, 4.0);
        d2.setColor("somethingElse");
        ShapeAdapter ad = new ShapeAdapter(d2);
        ad.changeVisibility();
        shapeDrawer.addBasicShape(ad);


        ShapeDiamond d3 = new ShapeDiamond(4.0, 4.0);
        d3.setColor("Yellow");
        ShapeAdapter ad1 = new ShapeAdapter(d3);
        ad1.changeVisibility();
        shapeDrawer.addBasicShape(ad1);


        Triangle t2 = new Triangle(5.0, 5.0, 5.0);
        t2.setColor("Green");
        ShapeAdapter ad2 = new ShapeAdapter(t2);
        ad2.changeVisibility();
        shapeDrawer.addBasicShape(ad2);


        ShapeDiamond d4 = new ShapeDiamond(1.0,1.0);
        d4.setColor("RED");
        shapeDrawer.addBasicShape(new ShapeAdapter(d4));


        BrushStroke b1 = new BrushStroke();
        b1.changeVisibility();
        shapeDrawer.addBasicShape(b1);


        BrushStroke b2 = new BrushStroke();
        b2.setColor("someColor");
        shapeDrawer.addBasicShape(b2);

        
        BrushStroke b3 = new BrushStroke();
        b3.setColor("GREEN");
        shapeDrawer.addBasicShape(b3);


       
        shapeDrawer.draw();

        
        System.out.println(); 
        shapeDrawer.grow();

        
        System.out.println(); 
        shapeDrawer.showVisibility();


    }
}
