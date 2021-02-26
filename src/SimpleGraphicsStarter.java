import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class SimpleGraphicsStarter extends Application {




    public void drawPicture(GraphicsContext g, int width, int height){
        g.setFill(Color.WHITE);
        g.fillRect(0,0, width, height);

        int centerX;
        int centerY;
        int colorChoice;
        int count;

        for (count=0; count<500; count++){
            centerX = (int)(width*Math.random());
            centerY = (int)(height*Math.random());

            colorChoice = (int )(4*Math.random());
            switch (colorChoice) {
                case 0:
                    g.setFill(Color.RED);
                    break;
                case 1:
                    g.setFill(Color.GREEN);
                    break;
                case 3:
                    g.setFill(Color.BLUE);
                case 4:
                    g.setFill(Color.YELLOW);
                    break;
            }
            g.fillOval(centerX - 50, centerY-50, 100, 100);
            g.setStroke(Color.BLACK);
            g.strokeOval(centerX - 50,centerY-50, 100, 100);
        }
    }
    public void start(Stage stage) {
        int width = 800;   // The width of the image.  You can modify this value!
        int height = 600;  // The height of the image. You can modify this value!
        Canvas canvas = new Canvas(width,height);
        drawPicture(canvas.getGraphicsContext2D(), width, height);
        BorderPane root = new BorderPane(canvas);
        root.setStyle("-fx-border-width: 4px; -fx-border-color: #444");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Simple Graphics"); // STRING APPEARS IN WINDOW TITLEBAR!
        stage.show();
        stage.setResizable(false);
    }

    public static void main(String[] args){
        launch();

    }

}
