package FarbSlider;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.DatePicker;

/**
 * Created by Kai on 14.04.2017.
 */
public class DatepickerBeispiel extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10,10,10,10));

        DatePicker startDatePicker = new DatePicker();

        Label startLabel = new Label("Start Datum");
        

        GridPane.setConstraints(startLabel, 0,0);

        grid.getChildren().add(startLabel);

        Scene scene = new Scene(grid, 400,400);
        primaryStage.setTitle("Farbwähler");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
