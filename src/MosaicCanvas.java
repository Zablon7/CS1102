import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MosaicCanvas {
    public MosaicCanvas(int rows, int columns, int preferredBlockWidth, int preferredBlockHeight){

    }

    public MosaicCanvas(int rows, int columns){
        this(rows, columns, 16, 16);
    }
    public MosaicCanvas(){
        this(42,42);
    }


    public interface Fillable{
        public void color(Color x);
    }
}


class FilledCircle extends Circle implements Strokeable, MosaicCanvas.Fillable {
    public void stroke(GraphicsContext g){

    }
    public void color(Color x){

    }

    int x = 3;

}
