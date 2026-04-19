package Jared_Arnold;

import java.text.DecimalFormat;

public class ShapeDiamond implements ShapeSpecial , CanBeColored{
    private double a = 2.0;
    private double b = 2.0;
    private static  DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";

    public ShapeDiamond(){
        
    }

    public ShapeDiamond(String color){
        this.color = color;
    }

    public ShapeDiamond(double a, double b){
        this.a = (a < 2.0) ? 2.0 : a;
        this.b = (b < 2.0) ? 2.0 : b;
    }

    public ShapeDiamond(double a, double b, String color) {
        this.a = (a < 2.0) ? 2.0 : a;
        this.b = (b < 2.0) ? 2.0 : b;
        this.color = color;
    }

     @Override
    public double calculateArea() {
        return (a * b) / 2.0;
    }

    @Override
    public double calculatePerimeter() {
    
    double halfA = a / 2.0;
    double halfB = b / 2.0;
    
    double side = Math.sqrt(halfA * halfA + halfB * halfB);

    return side * 4;
}

    @Override
    public void drawShape() {
    double area = calculateArea();
    double perimeter = calculatePerimeter();
    System.out.println("This is a diamond with area " + df2.format(area) + " and perimeter " + df2.format(perimeter) + ". Color: " + color);
}
    @Override
public String setColor(String str) {
    if (str == null || str.trim().isEmpty()) {
        this.color = "No color";
        return "No color";
    }

    if (str.equals("Blue") || str.equals("Green") || str.equals("Red") || str.equals("Yellow")) {
        this.color = str;
        return str;
    }

    
    this.color = "No color";
    return "No color";
}

@Override
public String getColor() {
    if ("No color".equals(this.color)) {
        return "has not been colored";
    }
    return this.color;
}

}
