package BunteButtons;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Insets;


/**
 * Created by Kai on 07.04.2017.
 */

public class BunteButton extends Application{
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        HBox vBox = new HBox(10);



        Button buttonblau = new Button("Blau");
        Button buttongelb = new Button("Gelb");
        Button buttongrün = new Button("Grün");
        Button testbutton = new Button("Test");
        buttonblau.setStyle("-fx-base: blue");
        buttongelb.setStyle("-fx-base: yellow");
        buttongrün.setStyle("-fx-base: green");
        Color Cblau = Color.BLUE;
        Color Cgelb = Color.YELLOW;
        Color Cgrün = Color.GREEN;



        // Button Farbe verändern

        buttonblau.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                borderPane.setStyle("-fx-background-color: #0000FF");
            }
        });

        buttongelb.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                borderPane.setStyle("-fx-background-color: yellow");

            }
        });
        buttonblau.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Du wolltest den blauen Button drücken!");
            }
        });

        buttongrün.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                borderPane.setStyle("-fx-background-color: green");
            }
        });


        // borderPane.setLeft(testbutton);
        //BorderPane.setAlignment(vBox, Pos.CENTER);
        vBox.getChildren().addAll(buttonblau,buttongelb,buttongrün);
        borderPane.setCenter(vBox);
        borderPane.setAlignment(vBox, Pos.CENTER);
        /*
        borderPane.setCenter(buttonblau);
        BorderPane.setAlignment(buttonblau, Pos.CENTER);
        borderPane.setLeft(buttongelb);
        BorderPane.setAlignment(buttongelb, Pos.CENTER);
        borderPane.setRight(buttongrün);
        BorderPane.setAlignment(buttongrün, Pos.CENTER);
        */


        Scene scene = new Scene(borderPane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bunte Farben WUHU!!!!");
        primaryStage.show();
    }
}
