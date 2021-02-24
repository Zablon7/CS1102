import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public interface Drawable{
    public void draw(GraphicsContext g);
}

class tryout{
    Drawable redSquare = new Drawable(){
        public void draw(GraphicsContext g){
            g.setFill(Color.RED);
            g.fillRect(10, 10, 100, 100);
        }
    };
    public static void main(String[] args){

    }

    void drawTwice(GraphicsContext g1, GraphicsContext g2, Drawable redSquare){
        redSquare.draw(g1);
        redSquare.draw(g2);
    }

}
