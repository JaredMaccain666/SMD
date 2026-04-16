package Jared_Arnold;

public class Rectangle extends Visibility implements ShapeBasic{
    public Rectangle() {
        super();
    }

    @Override
    public void draw() {
        System.out.println("This is a rectangle");
    }

    @Override
    public void grow() {
        System.out.println("Growing the size of the rectangle");
    }

    @Override
    public String printText() {
        return "Rectangle";
    }
}
