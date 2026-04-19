package Jared_Arnold;

import java.text.DecimalFormat;

public class Triangle implements ShapeSpecial, CanBeColored{
    
    private double a = 3.0;
    private double b = 3.0;
    private double c = 3.0;
    private static  DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";

    public Triangle(){
        
    }

    public Triangle(String color){
        this.color = color;
    }

    public Triangle(double a, double b, double c){
        this.a = (a < 3.0) ? 3.0 : a;
        this.b = (b < 3.0) ? 3.0 : b;
        this.c = (c < 3.0) ? 3.0 : c;
    }
    

    public Triangle(double a, double b, double c ,String color) {
        this.a = (a < 3.0) ? 3.0 : a;
        this.b = (b < 3.0) ? 3.0 : b;
        this.c = (c < 3.0) ? 3.0 : c;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
public void drawShape() {
    double area = calculateArea();
    double perimeter = calculatePerimeter();
    System.out.println("This is a triangle with area: " + df2.format(area) + " and perimeter: " + df2.format(perimeter) + ". Color: " + color);
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