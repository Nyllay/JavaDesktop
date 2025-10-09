package com.interfase.grafico.controllers;

import javax.swing.Action;
import javafx.scene.control.Alert;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private TextField nomeField;

    @FXML
    private TextField idadeField;

    @FXML
    private TextField emailField;

    public void handleEnviar(ActionEvent actionEvent){

        String nome = nomeField.getText();
        String idade = idadeField.getText();
        String email = emailField.getText();

        if (idade == null || idade.trim().isEmpty()) {
            showAlert("Por Favor, coloque a sua idade");   
        }

        if (email == null || email.trim().isEmpty()) {
            showAlert("Por Favor, coloque o seu email");   
        }
        
        if (nome == null || nome.trim().isEmpty()) {
            showAlert("Por Favor, coloque o seu nome");   
        }     

    }
    public void showAlert(String alerta) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Erro na valiação");
            alert.setHeaderText(null);
            alert.setContentText(alerta);
            alert.showAndWait();       
    }
}
