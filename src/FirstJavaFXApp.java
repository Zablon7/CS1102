import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class FirstJavaFXApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        Label message = new Label("My first JavaFX application.");
        message.setFont(new Font(20));

        Button helloButton = new Button("Say hello");
        helloButton.setOnAction(e -> message.setText("Hello, World!"));
        Button goodbyeButton = new Button("Say Goodbye");
        goodbyeButton.setOnAction(e -> message.setText("Goodbye!!"));
        Button quitButton = new Button("Quit");
        quitButton.setOnAction(e -> Platform.exit());

        HBox buttonBar = new HBox(10, helloButton, goodbyeButton, quitButton);
        buttonBar.setAlignment(Pos.CENTER);
        BorderPane root = new BorderPane();
        root.setCenter(message);
        root.setBottom(buttonBar);

        Scene scene = new Scene(root, 450, 200);
        stage.setScene(scene);
        stage.setTitle("CyberBruh");
        stage.show();
    }
}
