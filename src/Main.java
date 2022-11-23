import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.shape.*;;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Set the Title
        primaryStage.setTitle("First Application");

        // Create a button
        Button btn = new Button("Say 'Hello World'");
        // btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        // Create layout
        StackPane root = new StackPane();                   // StackPane is a layout manager, set the button into middle
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));   // Set the scene
        primaryStage.show();                                // Show the stage

        // Create a rectangle
        Rectangle rect = new Rectangle(100, 100, 100, 100);
        rect.setY(200);
        Group root1Group = new Group();
        root1Group.getChildren().add(rect);
    }
}