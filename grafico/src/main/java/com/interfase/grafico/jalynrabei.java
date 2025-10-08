package com.interfase.grafico;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class jalynrabei extends Application {
   
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = FXMLLoader.load(getClass().getResource("/interface.fxml"));

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Janela");

        stage.setScene(scene);

        stage.show();
    }
}