package com.example.calculadoraequipo;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Multiplicacion {

@FXML
private Label labResulMulti;
@FXML
private TextField txtNumero1;
@FXML
private TextField txtNumero2;
@FXML
private Button  btnResulMulti;

@FXML
    protected void resultado(ActionEvent event) throws IOException {


        double num1 = Double.parseDouble(txtNumero1.getText());
        double num2 = Double.parseDouble(txtNumero2.getText());
        double result = num1 * num2;
        labResulMulti.setText("El resultado es " + result );
    }

    @FXML
    protected void regresar(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("CALCULADORA");
        stage.show();
    }

}
