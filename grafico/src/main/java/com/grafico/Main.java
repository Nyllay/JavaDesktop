package com.grafico;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
public class Main extends Application {
     public static void main(String[] args) {
     }
        @Override
        public void start(Stage stage){
            Label Label = new  javafx.scene.control.Label("Digite seu nome: ");
            TextField textField = new TextField();


            Button button = new Button("Mostrar saudação");
            Label saudacao = new Label();


            button.setOnAction( e ->{
                String nome = textField.getText();
                saudacao.setText("Olá, " +nome+ "Seja bem vindo(a). ");
            });
            
            VBox vbox = new VBox(10);
            vbox.setStyle("-fx-padding: 20; -fx-alignment: center;");
            vbox.getChildren().addAll(Label, textField, button, saudacao);

            Scene scene =  new Scene(vbox, 400, 200);
            stage.setScene(scene);
            stage.setTitle("JavaFX + Input de Nome");
            stage.show();
            
        }
}