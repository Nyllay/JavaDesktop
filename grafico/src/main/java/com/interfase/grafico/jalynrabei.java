package com.interfase.grafico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class jalynrabei extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage){
        //caixa de texto
        Label label = new Label("Digite o Seu Nome: ");
        TextField textField = new TextField();
        //clicar no botao
        Button button = new Button("Clique Aqui");
        Label saudaolei = new Label();
        //precionar enter
        button.setDefaultButton(true);


        //evento do botao
        button.setOnAction(e -> {
            String nome = textField.getText().trim();
            if(nome.isEmpty()){
                saudaolei.setText("Por Favor, Digite o Seu Nome!");
                return;
            }
            else{
            saudaolei.setText("Ola, " + nome.toUpperCase() + " Seja Bem Vindo(a)!");}
        });

        VBox vbox = new VBox(10);
        vbox.setStyle("-fx-padding: 20; -fx-alignment: center;");
        vbox.getChildren().addAll(label, textField, button, saudaolei);

        Scene scene = new Scene(vbox,400,200);
        stage.setScene(scene);
        stage.setTitle("Casa 123");
        stage.show();





    }
}