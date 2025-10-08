package com.interfase.grafico.controllers;

import javax.swing.Action;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label label;

    public void handleButtonClick(ActionEvent actionEvent){
        label.setText("Botão Clicado!");
    }
    
}
