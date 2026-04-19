package Jared_Arnold;

import java.util.Random;

public class BrushStroke extends Visibility implements ShapeBasic,CanBeColored{
    private final int thickness;
    private String color = "Yellow";

    public BrushStroke(){
        Random random = new Random();
        
        this.thickness = random.nextInt(10) + 1;
    }

    @Override
    public void draw() {
        System.out.println("Brush strokes with thickness " + thickness);
    }

    @Override
    public void grow() {
        System.out.println("Adding some color..." + getColor());
    }

    @Override
    public String printText() {
        return "Brush Stroke";
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
            return "Out of color...";
        }
        return this.color;
    }

}
