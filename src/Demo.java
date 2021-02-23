import javafx.scene.canvas.GraphicsContext;

public class Demo{

    public static void main(String[] args) {
        Strokeable figure;
        figure = new Circle();
        GraphicsContext x = null;
        figure.stroke(x);

        Strokeable[] listOfFigures;
        listOfFigures = new Strokeable[10];
        listOfFigures[0] = new Circle();

    }
}
