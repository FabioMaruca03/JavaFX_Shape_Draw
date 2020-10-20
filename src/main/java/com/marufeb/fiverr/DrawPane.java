package com.marufeb.fiverr;

//import any classes necessary here
//----
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Shape;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Orientation;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;

public class DrawPane extends BorderPane
{
    private Button undoBtn, eraseBtn;
    private ComboBox<String> colorCombo;
    private RadioButton rbRect, rbCircle, rbArc;
    private ToggleGroup radioGroup;
    private ArrayList<Shape> shapeList;
    private VBox left;
    private HBox controls;
    private Pane canvas;
    //declare any other necessary instance variables here
    //----

    //Constructor
    public DrawPane()
    {
        //Step #1: initialize each instance variable and set up layout
        undoBtn = new Button("Undo");
        eraseBtn = new Button("Erase");
        undoBtn.setMinWidth(80.0);
        eraseBtn.setMinWidth(80.0);

        canvas = new Pane();
        setCenter(canvas);

        left = new VBox(20);
        left.setAlignment(Pos.CENTER);
        setLeft(left);

        controls = new HBox(40);
        controls.setAlignment(Pos.CENTER);
        controls.getChildren().addAll(undoBtn, eraseBtn);
        setBottom(controls);

        //Create the color comboBox and initialize its default color
        colorCombo = new ComboBox<>();
        colorCombo.getItems().setAll("Black", "Red", "Blue", "Green", "Yellow", "Orange", "Pink");
        left.getChildren().add(colorCombo);
        //----

        //Create the three radio buttons and also a ToggleGroup
        //so that the three radio buttons can be selected
        //mutually exclusively. Otherwise they are independent of each other
        rbRect = new RadioButton("Rectangle");
        rbCircle = new RadioButton("Circle");
        rbArc = new RadioButton("Arc");
        radioGroup = new ToggleGroup();
        rbRect.setToggleGroup(radioGroup);
        rbCircle.setToggleGroup(radioGroup);
        rbArc.setToggleGroup(radioGroup);
        left.getChildren().addAll(rbRect, rbCircle, rbArc);
        //----

        //initialize shapeList, it is a data structure we used
        //to track the shape we drew
        shapeList = new ArrayList<>();
        //----

        //canvas is a Pane where we will draw rectagles, circles and arcs on it
        canvas.setStyle("-fx-background-color: Azure;");

        //Step #3: Register the source nodes with its handler objects
        canvas.setOnMousePressed(new MouseHandler());
        //----
        //----

    }

    //Step #2(A) - MouseHandler
    private class MouseHandler implements EventHandler<MouseEvent>
    {
        public void handle(MouseEvent event)
        {
            //handle MouseEvent here
            //Note: you can use if(event.getEventType()== MouseEvent.MOUSE_PRESSED)
            //to check whether the mouse key is pressed, dragged or released
            //write your own codes here
            //----





        }//end handle()
    }//end MouseHandler

    //Step #2(B)- A handler class used to handle events from Undo & Erase buttons
    private class ButtonHandler implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent event)
        {
            //write your codes here
            //----



        }
    }//end ButtonHandler

    //Step #2(C)- A handler class used to handle events from the three radio buttons
    private class ShapeHandler implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent event)
        {
            //write your own codes here
            //----



        }
    }//end ShapeHandler

    //Step #2(D)- A handler class used to handle colors from the combo box
    private class ColorHandler implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent event)
        {
            //write your own codes here
            //----

        }
    }//end ColorHandler

}//end class DrawPane

