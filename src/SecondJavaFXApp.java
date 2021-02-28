import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class SecondJavaFXApp extends Application {
    private Font font1, font2, font3, font4, font5; // Different fonts to pick at Random
    private Canvas canvas; // The canvas/window we will be using
    private final static String MESSAGE = "Hello JAVAFX"; // The message we will be displaying


    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage stage){
        font1 = Font.font("Times New Roman", FontWeight.BOLD, 20); // Font option 1
        font2 = Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 28); // Font option 2
        font3 = Font.font("Verdana", 32); // Font option 3
        font4 = Font.font(40); // Font option 4
        font5 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 60); // Font option 5

        canvas = new Canvas(500, 500); // We define the canvas above and give it it's dimensions
        draw(); // We call the draw method, which is below

        Button redraw = new Button("Redraw"); // We create a button to redraw our picture
        redraw.setOnAction(e-> draw()); // Everytime the button is touched, draw() is called again.
        Button quit = new Button("Exit!");
        quit.setOnAction(e-> Platform.exit());

        StackPane bottom = new StackPane(redraw); // We define a layout style for our button
        bottom.setStyle("-fx-background-color:gray; -fx-padding:10px;" +
                " -fx-border-color:black; -fx-border-width: 6px 0 0 0;"); // We use css to arrange it
        BorderPane root = new BorderPane(canvas); // We create a BorderPane around our canvas, named root.
        root.setBottom(quit);
        root.setBottom(bottom); // We set our button to be below.
        root.setStyle("-fx-border-color:black; -fx-border-width: 2px; "); // We set style for our whole

        stage.setScene(new Scene(root, Color.BLACK)); // We can't see the black cause canvas,
                                                      // is filled with white in the draw() method
        stage.setTitle("Random Strings");       // Title of our application
        stage.setResizable(false);              // We instruct the stage to always have the same size
        stage.show();
    }

    private void draw(){

        GraphicsContext g = canvas.getGraphicsContext2D(); // Turn our canvas into a 2D graphics context g

        double width = canvas.getWidth();  // Would get width of canvas, which is 500
        double height = canvas.getHeight(); // Would get height of canvas, which is 500

        g.setFill(Color.BLACK); // Color of the canvas
        g.fillRect(0, 0, width, height); // this would create our rectangle with the border of the whole canvas;

        for (int i = 0; i<25; i++){ // Basically helps create 25 drawings
            int fontNum = (int)(5*Math.random()) + 1; //Draws random number from 1 to 5 to select font
            switch (fontNum) {
                case 1 -> g.setFont(font1);
                case 2 -> g.setFont(font2);
                case 3 -> g.setFont(font3);
                case 4 -> g.setFont(font4);
                case 5 -> g.setFont(font5);
            }

            double hue = 360*Math.random(); // Randomly selects hue which in turn selects color.
            g.setFill(Color.hsb(hue, 1, 1)); // We instruct setFill with the following configuration

            // Select the position of the string at random;
            // Nothing big, it's just points on a cartesian plane.
            double x, y;            // Randomizing our x and y
            x = -50 + Math.random() * (width+40); // width is 500
            y = Math.random()*(height+20); // height is 500

            //Draw the message, the color we used during g.setFill() is applied here.
            g.fillText(MESSAGE, x, y);

            // Also stroke the outline of the strings with black.
            g.setStroke(Color.BLACK); // Set color for the border of the texts
            g.strokeText(MESSAGE, x, y); // Apply color on the border of the texts, on their respective location

        }
    }
}
