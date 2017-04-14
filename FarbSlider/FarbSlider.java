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

/**
 * Created by Kai on 14.04.2017.
 */
public class FarbSlider extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10,10,10,10));

        Rectangle r = new Rectangle();
        r.setWidth(200);
        r.setHeight(100);

        grid.getChildren().add(r);
        GridPane.setConstraints(r, 0, 3);

        Label[] labels = new Label[3];
        Slider[] sliders = new Slider[3];

        for(int i = 0; i<3; i++){

            sliders[i] = new Slider();
            sliders[i].setMin(0);
            sliders[i].setMax(255);
            sliders[i].setValue(40);
            sliders[i].setShowTickMarks(true);
            sliders[i].setMinorTickCount(5);
            sliders[i].setMajorTickUnit(50);
            sliders[i].setBlockIncrement(10);
            sliders[i].setShowTickLabels(true);

            labels[i] = new Label();
            grid.getChildren().add(labels[i]);
            GridPane.setConstraints(labels[i], 1, i);


            grid.getChildren().add(sliders[i]);
            GridPane.setConstraints(sliders[i], 0, i);



        }

        labels[0].setText("Rot");
        labels[1].setText("Grün");
        labels[2].setText("Blau");

        r.setFill(Color.rgb((int)sliders[0].getValue(), (int)sliders[1].getValue(), (int)sliders[2].getValue()));

        for (int i = 0; i<3; i++){


            sliders[i].valueProperty().addListener(new ChangeListener<Number>() {
                @Override
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                    r.setFill(Color.rgb((int)sliders[0].getValue(), (int)sliders[1].getValue(), (int)sliders[2].getValue()));
                }
            });


        }


        Scene scene = new Scene(grid, 400,400);
        primaryStage.setTitle("Farbwähler");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
