package com.example.interfazdinamica;

import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class Controller {

    @FXML
    Animation animacionMenu;
    @FXML
    Button btnMenu;
    @FXML
    VBox vBoxIzquierda;

    public Controller() {
        animacionMenu = new TranslateTransition(Duration.millis(100), vBoxIzquierda);
    }


    /*
    public void animacionMenu(){


        animacionMenu.setFromX(mostrar ? 0 : panelMenu.getWidth());
        animacionMenu.setToX(mostrar ? panelMenu.getWidth() : 0);
        animacionMenu.play();

    }

    public void initComponents() {
        animacionMenu();

    }
*/

}