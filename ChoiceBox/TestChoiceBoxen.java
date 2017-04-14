package ChoiceBox;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;

/**
 * Created by Kai on 07.04.2017.
 */

public class TestChoiceBoxen extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(5);
        grid.setPadding(new Insets(10,10,10,10));

        ChoiceBox cb = new ChoiceBox(FXCollections.observableArrayList("Norden", "Osten", "Süden", "Westen"));


        String [] verbindungen = new String[] {"Dänemark", "Polen","Schweiz","Niederlande"};
        Label label = new Label();

        cb.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

                label.setText(verbindungen[newValue.intValue()]);

            }
        });

        cb.setTooltip(new Tooltip("Wähle die Himmeslrichtung!"));

        grid.getChildren().add(cb);
        GridPane.setConstraints(cb, 0,0);
        grid.getChildren().add(label);
        GridPane.setConstraints(label, 5,0);

        Scene scene = new Scene(grid, 300,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Himmelsrichtung");
        primaryStage.show();
    }
}
