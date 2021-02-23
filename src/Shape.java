import javafx.scene.paint.Color;

public abstract class Shape {
    Color color;
    Object value;

    void setColor(Color newColor){
        color = newColor;
        redraw();
    }

    abstract void redraw();
}

class Rectangle extends Shape{
    void redraw() {
        System.out.println("Rectangle");
        // Commands to draw an rectangle
    }
}

class Oval extends Shape{
    void redraw() {
        System.out.println("Oval");
        // Commands to draw an oval
    }
}

class RoundRect extends Shape{
    void redraw() {
        System.out.println("RoundRect");
        // Commands to draw a rounded rectangle
    }
    // Possibly more methods and variables
}
