package com.example.demo2;

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.shape.*;
import javafx.scene.paint.Color;
public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250);
//////////////////////////////////////////////////////
// elements of the scene will be inserted here
        Rectangle r = new Rectangle(50, 50, 200, 100); // creating figure
        root.getChildren().add(r); // adding figure to root container
        r.setFill(Color.rgb(255, 165, 0)); // setting yellow color by means of constant
        scene.setFill(Color.rgb(127,255,0)); // setting green background by meansconstant
        Rectangle s = new Rectangle(60,60,140,80);
        s.setArcWidth(20);
        s.setArcHeight(20);
        root.getChildren().add(s);
        s.setFill(Color.rgb(128, 128, 128));

        //Circles
        Circle circle = new Circle(230,90,5); //circle 1
        root.getChildren().add(circle);
        circle.setFill(Color.rgb(0, 0, 0));
        Circle b = new Circle(230,110,5); //circle 2
        root.getChildren().add(b);
        b.setFill(Color.rgb(0, 0, 0));
        Circle c = new Circle(230,130,5);  //circle 3
        root.getChildren().add(c);
        c.setFill(Color.rgb(0, 0, 0));

        //Lines
        Line line = new Line(150.0f, 50.0f, 170.0f, 20.0f);
        root.getChildren().add(line);
        Line lineb = new Line(130.0f, 20.0f, 150.0f, 50.0f);
        root.getChildren().add(lineb);

//////////////////////////////////////////////////////
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
